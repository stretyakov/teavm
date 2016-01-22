/*
 *  Copyright 2016 Vyacheslav Tretyakov.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.teavm.jso.websocket;

import org.teavm.jso.JSProperty;
import org.teavm.jso.dom.events.EventTarget;
import org.teavm.jso.typedarrays.ArrayBuffer;
import org.teavm.jso.typedarrays.ArrayBufferView;



/**
 * 
 * @author Vyacheslav Tretyakov
 * 
 */
public interface WebSocket extends EventTarget {
    // type
    String BINARY_TYPE_BLOB = "blob";
    String BINARY_TYPE_ARRAY = "arraybuffer";

    // events
    String SOCKET_OPEN = "open";
    String SOCKET_CLOSE = "close";
    String SOCKET_MESSAGE = "message";
    String SOCKET_ERROR = "error";

    // ready state
    int CONNECTING = 0;
    int OPEN = 1;
    int CLOSING = 2;
    int CLOSED = 3;

    /**
     * 
     * @return
     */
    @JSProperty
    String getBinaryType();

    /**
     * 
     * @param type
     */
    @JSProperty
    void setBinaryType(String type);

    /**
     * 
     * @return
     */
    @JSProperty
    int getReadyState();

    /**
     * 
     * @return
     */
    @JSProperty
    long getBufferedAmount();

    /**
     * 
     * @return
     */
    @JSProperty
    String getUrl();

    /**
     *
     * @return
     */
    @JSProperty
    String getExtensions();

    /**
     *
     * @return
     */
    @JSProperty
    String getProtocol();

    /**
     *
     * @param message
     */
    void send(String message);

    /**
     *
     * @param data
     */
    void send(ArrayBuffer data);

    /**
     *
     * @param data
     */
    void send(ArrayBufferView data);

    /**
    *
    */
    void close();
}