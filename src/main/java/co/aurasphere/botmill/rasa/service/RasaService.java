/**
 * 
 * MIT License
 *
 * Copyright (c) 2017 BotMill.io
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * 
 */
package co.aurasphere.botmill.rasa.service;

import co.aurasphere.botmill.rasa.incoming.model.Response;
import co.aurasphere.botmill.rasa.outgoing.model.Query;
import co.aurasphere.botmill.util.JsonUtils;
import co.aurasphere.botmill.util.NetworkUtils;

/**
 * The Class RasaService.
 */
public class RasaService {

	/**
	 * Send parse request.
	 *
	 * @param query the query
	 * @return the response
	 */
	public synchronized static Response sendParseRequest(String query) {
		Query q = new Query();
		q.setQuery(query);
		String response = NetworkUtils.postParse(q);
		Response resp = JsonUtils.fromJson(response, Response.class);
		return resp;
		
	}
	
	/**
	 * Send train request.
	 *
	 * @param data the data
	 * @return the response
	 */
	public synchronized static Response sendTrainRequest(Object data) {
		return null;
		
	}
	
	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public synchronized static Response getStatus() {
		return null;
		
	}
}
