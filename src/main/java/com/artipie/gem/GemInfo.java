/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2020 artipie.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.artipie.gem;

import com.artipie.asto.Storage;
import com.artipie.http.Response;
import com.artipie.http.Slice;
import com.artipie.http.rs.RsStatus;
import io.reactivex.Flowable;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Map;
import org.reactivestreams.Publisher;

/**
 * Returns some basic information about the given gem. GET - /api/v1/gems/[GEM NAME].(json|yaml)
 * https://guides.rubygems.org/rubygems-org-api/
 *
 * @todo #32:120min Gem Information implementation.
 *  The implementation must be able to response with either json or yaml format. An example response
 *  can be obtained via {@code curl https://rubygems.org/api/v1/gems/rails.json}
 * @since 0.2
 */
@SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
public final class GemInfo implements Slice {

    /**
     * The storage.
     */
    private final Storage storage;

    /**
     * Ctor.
     * @param storage The storage
     */
    public GemInfo(final Storage storage) {
        this.storage = storage;
    }

    @Override
    public Response response(final String line,
        final Iterable<Map.Entry<String, String>> headers,
        final Publisher<ByteBuffer> body) {
        return connection -> connection.accept(
            RsStatus.NOT_IMPLEMENTED,
            new HashSet<>(),
            Flowable.empty()
        );
    }
}