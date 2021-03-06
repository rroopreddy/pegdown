/*
 * Copyright (C) 2010 Mathias Doenitz
 *
 * Based on peg-markdown (C) 2008-2010 John MacFarlane
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.pegdown.ast;


public class ExpLinkNode extends Node {

    private String url;
    private String title;
    private boolean image;

    public ExpLinkNode(Node firstChild) {
        super(firstChild);
    }

    public boolean setUrl(String url) {
        this.url = url;
        return true;
    }

    public boolean setTitle(String title) {
        this.title = title;
        return true;
    }

    public ExpLinkNode asImage() {
        image = true;
        return this;
    }

    public String getUrl() {
		return url;
	}

	public String getTitle() {
		return title;
	}

	public boolean getImage() {
		return image;
	}
}