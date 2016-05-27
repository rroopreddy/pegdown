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

package org.pegdown;

import org.testng.annotations.Test;

public class PhpMarkdownTest extends AbstractTest {

    private final PegDownProcessor processor = new PegDownProcessor(Extensions.NONE);

    @Override
    public PegDownProcessor getProcessor() {
        return processor;
    }

    @Test
    public void phpMarkdownTests() throws Exception {
        test("phpmarkdown/Backslash_escapes");
        test("phpmarkdown/Code_block_in_a_list_item");
        test("phpmarkdown/Code_Spans");
        //test("phpmarkdown/Email_auto_links");
        //test("phpmarkdown/Emphasis");
        test("phpmarkdown/Headers");
        test("phpmarkdown/Horizontal_Rules");
        test("phpmarkdown/Inline_HTML_(Simple)");
        test("phpmarkdown/Inline_HTML_(Span)");
        test("phpmarkdown/Inline_HTML_comments");
        //test("phpmarkdown/Ins_and_del");
        //test("phpmarkdown/Links_inline_style");
        test("phpmarkdown/MD5_Hashes");
        //test("phpmarkdown/Nesting");
        //test("phpmarkdown/Parens_in_URL");
        //test("phpmarkdown/PHP-Specific_Bugs");
        test("phpmarkdown/Tight_blocks");
    }

}