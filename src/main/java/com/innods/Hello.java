/*
 * Copyright 2013 Jin Kwon <onacit at gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.innods;


/**
 * A class whose main method prints out the words {@code hello, world} with a {@code line-feed(\n)}.
 * <h3>Abstract</h3>
 * <p> <p/>
 * <p/>
 * <blockquote>The only way to learn a new programming language is by writing programs in it. The first program to
 * write is the same for all languages:<br/>Print the words<br/><code>hello, world</code></blockquote>
 * The name of this Java file is derived from the original C file ('hello.c') and that's the reason why this class
 * named as 'Hello' not 'HelloWorld'.
 * <p/>
 * <h3>Build and Run</h3>
 * To build this project, simply execute following command in prompt.
 * <pre>
 * mvn clean install
 * </pre>
 * To run this class's main method, execute following command in prompt.
 * <pre>
 * mvn --quiet exec:java -Dexec.mainClass=com.innods.Hello
 * </pre>
 * Or execute the output jar directly like this. (Replace the {@code <version>} part with the actual value.)
 * <pre>
 * java -jar ./target/hello-world-&lt;version&gt;.jar (Unix)
 * java -jar .\target\hello-world-&lt;version&gt;.jar (Windows)
 * </pre>
 *
 * @author Jin Kwon <onacit at gmail.com>
 * @see <a href="http://www.pearsonhighered.com/educator/product/C-Programming-Language/9780131103627.page">C
 *      Programming Language, 2/E (Peason Higher Ed)</a>
 * @see <a href="http://en.wikipedia.org/wiki/The_c_programming_language">The C Programming Language (Wikipedia)</a>
 */
public class Hello {

    /**
     * Prints the words {@code hello, world} and a {@code line-feed(\n)} via system output.
     *
     * @param args the command line arguments. Note that this method doesn't use any of these arguments.
     */
    public static void main(final String[] args) {

        System.out.printf("hello, world\n");
    }
}
