package de.onvif.soap;

import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.DefaultHttpResponse;
import io.netty.handler.codec.http.HttpContent;
import io.netty.handler.codec.http.LastHttpContent;
import io.netty.util.CharsetUtil;
import io.netty.util.ReferenceCountUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
public class OnvifCodec extends ChannelDuplexHandler {

    private final OnvifEventHandler onvifEventHandler;
    private final String entityID;
    private String incomingMessage = "";
    private int code;

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        if (msg == null || ctx == null) {
            return;
        }
        try {
            if (msg instanceof HttpContent content) {
                incomingMessage += content.content().toString(CharsetUtil.UTF_8);
            }
            if (msg instanceof LastHttpContent) {
                onvifEventHandler.handle(incomingMessage, code);
                ctx.close();
            }
            if (msg instanceof DefaultHttpResponse) {
                this.code = ((DefaultHttpResponse) msg).status().code();
            }
        } finally {
            ReferenceCountUtil.release(msg);
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        if (ctx == null || cause == null) {
            return;
        }
        log.debug("[{}]: Exception on ONVIF connection: {}", entityID, cause.getMessage());
        ctx.close();
    }

    public interface OnvifEventHandler {

        void handle(String message, int code);
    }
}
