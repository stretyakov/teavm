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

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;



/**
 * 
 * @author Vyacheslav Tretyakov
 * 
 */
public final class WebSocketFactory implements JSObject {
    /**
     * 
     * @param url
     * @return
     */
    @JSBody(params = "url", script = "return new WebSocket(url);")
    public static native WebSocket create(String url);

    /**
     * 
     * @param url
     * @param protocol
     * @return
     */
    @JSBody(params = { "url", "protocol" }, script = "return new WebSocket(url, protocol);")
    public static native WebSocket create(String url, String protocol);

    /**
     * 
     */
    private WebSocketFactory() {
    }
}