package com.yao.server;

import com.yao.utils.SerializationUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * Created by root on 15-2-5.
 */
public class RpcEncoder extends MessageToByteEncoder {
    private Class<?> genericClass;


    public RpcEncoder(Class<?> genericClass) {
        this.genericClass = genericClass;
    }


    @Override
    public void encode(ChannelHandlerContext ctx, Object in, ByteBuf out) throws Exception {
        if (genericClass.isInstance(in)) {
            byte[] data = SerializationUtil.serialize(in);
            out.writeInt(data.length);
            out.writeBytes(data);
        }
    }
}
