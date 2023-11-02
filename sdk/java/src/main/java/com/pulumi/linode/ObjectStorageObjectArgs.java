// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectStorageObjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectStorageObjectArgs Empty = new ObjectStorageObjectArgs();

    /**
     * The access key to authenticate with.
     * 
     */
    @Import(name="accessKey", required=true)
    private Output<String> accessKey;

    /**
     * @return The access key to authenticate with.
     * 
     */
    public Output<String> accessKey() {
        return this.accessKey;
    }

    /**
     * The canned ACL to apply. (`private`, `public-read`, `authenticated-read`, `public-read-write`, `custom`) (defaults to `private`).
     * 
     */
    @Import(name="acl")
    private @Nullable Output<String> acl;

    /**
     * @return The canned ACL to apply. (`private`, `public-read`, `authenticated-read`, `public-read-write`, `custom`) (defaults to `private`).
     * 
     */
    public Optional<Output<String>> acl() {
        return Optional.ofNullable(this.acl);
    }

    /**
     * The name of the bucket to put the object in.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return The name of the bucket to put the object in.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * Specifies caching behavior along the request/reply chain Read [w3c cache_control](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
     * 
     */
    @Import(name="cacheControl")
    private @Nullable Output<String> cacheControl;

    /**
     * @return Specifies caching behavior along the request/reply chain Read [w3c cache_control](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
     * 
     */
    public Optional<Output<String>> cacheControl() {
        return Optional.ofNullable(this.cacheControl);
    }

    /**
     * The cluster the bucket is in.
     * 
     */
    @Import(name="cluster", required=true)
    private Output<String> cluster;

    /**
     * @return The cluster the bucket is in.
     * 
     */
    public Output<String> cluster() {
        return this.cluster;
    }

    /**
     * Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    /**
     * @return Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
     * 
     */
    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
     * 
     */
    @Import(name="contentBase64")
    private @Nullable Output<String> contentBase64;

    /**
     * @return Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
     * 
     */
    public Optional<Output<String>> contentBase64() {
        return Optional.ofNullable(this.contentBase64);
    }

    /**
     * Specifies presentational information for the object. Read [w3c content_disposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
     * 
     */
    @Import(name="contentDisposition")
    private @Nullable Output<String> contentDisposition;

    /**
     * @return Specifies presentational information for the object. Read [w3c content_disposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
     * 
     */
    public Optional<Output<String>> contentDisposition() {
        return Optional.ofNullable(this.contentDisposition);
    }

    /**
     * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
     * 
     */
    @Import(name="contentEncoding")
    private @Nullable Output<String> contentEncoding;

    /**
     * @return Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
     * 
     */
    public Optional<Output<String>> contentEncoding() {
        return Optional.ofNullable(this.contentEncoding);
    }

    /**
     * The language the content is in e.g. en-US or en-GB.
     * 
     */
    @Import(name="contentLanguage")
    private @Nullable Output<String> contentLanguage;

    /**
     * @return The language the content is in e.g. en-US or en-GB.
     * 
     */
    public Optional<Output<String>> contentLanguage() {
        return Optional.ofNullable(this.contentLanguage);
    }

    /**
     * A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    /**
     * @return A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
     * 
     */
    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * Used with the s3 client to make bucket changes and will be computed automatically if left blank, override for testing/debug purposes.
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return Used with the s3 client to make bucket changes and will be computed automatically if left blank, override for testing/debug purposes.
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * The specific version of this object.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return The specific version of this object.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Allow the object to be deleted regardless of any legal hold or object lock (defaults to `false`).
     * 
     */
    @Import(name="forceDestroy")
    private @Nullable Output<Boolean> forceDestroy;

    /**
     * @return Allow the object to be deleted regardless of any legal hold or object lock (defaults to `false`).
     * 
     */
    public Optional<Output<Boolean>> forceDestroy() {
        return Optional.ofNullable(this.forceDestroy);
    }

    /**
     * They name of the object once it is in the bucket.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return They name of the object once it is in the bucket.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * A map of keys/values to provision metadata.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return A map of keys/values to provision metadata.
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The secret key to authenitcate with.
     * 
     */
    @Import(name="secretKey", required=true)
    private Output<String> secretKey;

    /**
     * @return The secret key to authenitcate with.
     * 
     */
    public Output<String> secretKey() {
        return this.secretKey;
    }

    /**
     * The path to a file that will be read and uploaded as raw bytes for the object content. The path must either be relative to the root module or absolute.
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return The path to a file that will be read and uploaded as raw bytes for the object content. The path must either be relative to the root module or absolute.
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * Specifies a target URL for website redirect.
     * 
     */
    @Import(name="websiteRedirect")
    private @Nullable Output<String> websiteRedirect;

    /**
     * @return Specifies a target URL for website redirect.
     * 
     */
    public Optional<Output<String>> websiteRedirect() {
        return Optional.ofNullable(this.websiteRedirect);
    }

    private ObjectStorageObjectArgs() {}

    private ObjectStorageObjectArgs(ObjectStorageObjectArgs $) {
        this.accessKey = $.accessKey;
        this.acl = $.acl;
        this.bucket = $.bucket;
        this.cacheControl = $.cacheControl;
        this.cluster = $.cluster;
        this.content = $.content;
        this.contentBase64 = $.contentBase64;
        this.contentDisposition = $.contentDisposition;
        this.contentEncoding = $.contentEncoding;
        this.contentLanguage = $.contentLanguage;
        this.contentType = $.contentType;
        this.endpoint = $.endpoint;
        this.etag = $.etag;
        this.forceDestroy = $.forceDestroy;
        this.key = $.key;
        this.metadata = $.metadata;
        this.secretKey = $.secretKey;
        this.source = $.source;
        this.websiteRedirect = $.websiteRedirect;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectStorageObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectStorageObjectArgs $;

        public Builder() {
            $ = new ObjectStorageObjectArgs();
        }

        public Builder(ObjectStorageObjectArgs defaults) {
            $ = new ObjectStorageObjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey The access key to authenticate with.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey The access key to authenticate with.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param acl The canned ACL to apply. (`private`, `public-read`, `authenticated-read`, `public-read-write`, `custom`) (defaults to `private`).
         * 
         * @return builder
         * 
         */
        public Builder acl(@Nullable Output<String> acl) {
            $.acl = acl;
            return this;
        }

        /**
         * @param acl The canned ACL to apply. (`private`, `public-read`, `authenticated-read`, `public-read-write`, `custom`) (defaults to `private`).
         * 
         * @return builder
         * 
         */
        public Builder acl(String acl) {
            return acl(Output.of(acl));
        }

        /**
         * @param bucket The name of the bucket to put the object in.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the bucket to put the object in.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param cacheControl Specifies caching behavior along the request/reply chain Read [w3c cache_control](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
         * 
         * @return builder
         * 
         */
        public Builder cacheControl(@Nullable Output<String> cacheControl) {
            $.cacheControl = cacheControl;
            return this;
        }

        /**
         * @param cacheControl Specifies caching behavior along the request/reply chain Read [w3c cache_control](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
         * 
         * @return builder
         * 
         */
        public Builder cacheControl(String cacheControl) {
            return cacheControl(Output.of(cacheControl));
        }

        /**
         * @param cluster The cluster the bucket is in.
         * 
         * @return builder
         * 
         */
        public Builder cluster(Output<String> cluster) {
            $.cluster = cluster;
            return this;
        }

        /**
         * @param cluster The cluster the bucket is in.
         * 
         * @return builder
         * 
         */
        public Builder cluster(String cluster) {
            return cluster(Output.of(cluster));
        }

        /**
         * @param content Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param contentBase64 Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
         * 
         * @return builder
         * 
         */
        public Builder contentBase64(@Nullable Output<String> contentBase64) {
            $.contentBase64 = contentBase64;
            return this;
        }

        /**
         * @param contentBase64 Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
         * 
         * @return builder
         * 
         */
        public Builder contentBase64(String contentBase64) {
            return contentBase64(Output.of(contentBase64));
        }

        /**
         * @param contentDisposition Specifies presentational information for the object. Read [w3c content_disposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
         * 
         * @return builder
         * 
         */
        public Builder contentDisposition(@Nullable Output<String> contentDisposition) {
            $.contentDisposition = contentDisposition;
            return this;
        }

        /**
         * @param contentDisposition Specifies presentational information for the object. Read [w3c content_disposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
         * 
         * @return builder
         * 
         */
        public Builder contentDisposition(String contentDisposition) {
            return contentDisposition(Output.of(contentDisposition));
        }

        /**
         * @param contentEncoding Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
         * 
         * @return builder
         * 
         */
        public Builder contentEncoding(@Nullable Output<String> contentEncoding) {
            $.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * @param contentEncoding Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
         * 
         * @return builder
         * 
         */
        public Builder contentEncoding(String contentEncoding) {
            return contentEncoding(Output.of(contentEncoding));
        }

        /**
         * @param contentLanguage The language the content is in e.g. en-US or en-GB.
         * 
         * @return builder
         * 
         */
        public Builder contentLanguage(@Nullable Output<String> contentLanguage) {
            $.contentLanguage = contentLanguage;
            return this;
        }

        /**
         * @param contentLanguage The language the content is in e.g. en-US or en-GB.
         * 
         * @return builder
         * 
         */
        public Builder contentLanguage(String contentLanguage) {
            return contentLanguage(Output.of(contentLanguage));
        }

        /**
         * @param contentType A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        /**
         * @param endpoint Used with the s3 client to make bucket changes and will be computed automatically if left blank, override for testing/debug purposes.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint Used with the s3 client to make bucket changes and will be computed automatically if left blank, override for testing/debug purposes.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param etag The specific version of this object.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag The specific version of this object.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param forceDestroy Allow the object to be deleted regardless of any legal hold or object lock (defaults to `false`).
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            $.forceDestroy = forceDestroy;
            return this;
        }

        /**
         * @param forceDestroy Allow the object to be deleted regardless of any legal hold or object lock (defaults to `false`).
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(Boolean forceDestroy) {
            return forceDestroy(Output.of(forceDestroy));
        }

        /**
         * @param key They name of the object once it is in the bucket.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key They name of the object once it is in the bucket.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param metadata A map of keys/values to provision metadata.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata A map of keys/values to provision metadata.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param secretKey The secret key to authenitcate with.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey The secret key to authenitcate with.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        /**
         * @param source The path to a file that will be read and uploaded as raw bytes for the object content. The path must either be relative to the root module or absolute.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The path to a file that will be read and uploaded as raw bytes for the object content. The path must either be relative to the root module or absolute.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        /**
         * @param websiteRedirect Specifies a target URL for website redirect.
         * 
         * @return builder
         * 
         */
        public Builder websiteRedirect(@Nullable Output<String> websiteRedirect) {
            $.websiteRedirect = websiteRedirect;
            return this;
        }

        /**
         * @param websiteRedirect Specifies a target URL for website redirect.
         * 
         * @return builder
         * 
         */
        public Builder websiteRedirect(String websiteRedirect) {
            return websiteRedirect(Output.of(websiteRedirect));
        }

        public ObjectStorageObjectArgs build() {
            $.accessKey = Objects.requireNonNull($.accessKey, "expected parameter 'accessKey' to be non-null");
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.cluster = Objects.requireNonNull($.cluster, "expected parameter 'cluster' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.secretKey = Objects.requireNonNull($.secretKey, "expected parameter 'secretKey' to be non-null");
            return $;
        }
    }

}
