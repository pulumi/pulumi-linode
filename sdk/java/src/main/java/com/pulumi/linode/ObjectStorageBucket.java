// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.ObjectStorageBucketArgs;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.inputs.ObjectStorageBucketState;
import com.pulumi.linode.outputs.ObjectStorageBucketCert;
import com.pulumi.linode.outputs.ObjectStorageBucketLifecycleRule;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Linode Object Storage Bucket resource. This can be used to create, modify, and delete Linodes Object Storage Buckets.
 * 
 * ## Example Usage
 * 
 * The following example shows how one might use this resource to create an Object Storage Bucket:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.LinodeFunctions;
 * import com.pulumi.linode.inputs.GetObjectStorageClusterArgs;
 * import com.pulumi.linode.ObjectStorageBucket;
 * import com.pulumi.linode.ObjectStorageBucketArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var primary = LinodeFunctions.getObjectStorageCluster(GetObjectStorageClusterArgs.builder()
 *             .id(&#34;us-east-1&#34;)
 *             .build());
 * 
 *         var foobar = new ObjectStorageBucket(&#34;foobar&#34;, ObjectStorageBucketArgs.builder()        
 *             .cluster(primary.applyValue(getObjectStorageClusterResult -&gt; getObjectStorageClusterResult.id()))
 *             .label(&#34;mybucket&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Creating an Object Storage Bucket with Lifecycle rules:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.ObjectStorageKey;
 * import com.pulumi.linode.ObjectStorageKeyArgs;
 * import com.pulumi.linode.ObjectStorageBucket;
 * import com.pulumi.linode.ObjectStorageBucketArgs;
 * import com.pulumi.linode.inputs.ObjectStorageBucketLifecycleRuleArgs;
 * import com.pulumi.linode.inputs.ObjectStorageBucketLifecycleRuleExpirationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var mykey = new ObjectStorageKey(&#34;mykey&#34;, ObjectStorageKeyArgs.builder()        
 *             .label(&#34;image-access&#34;)
 *             .build());
 * 
 *         var mybucket = new ObjectStorageBucket(&#34;mybucket&#34;, ObjectStorageBucketArgs.builder()        
 *             .accessKey(mykey.accessKey())
 *             .secretKey(mykey.secretKey())
 *             .cluster(&#34;us-east-1&#34;)
 *             .label(&#34;mybucket&#34;)
 *             .lifecycleRules(ObjectStorageBucketLifecycleRuleArgs.builder()
 *                 .id(&#34;my-rule&#34;)
 *                 .enabled(true)
 *                 .abortIncompleteMultipartUploadDays(5)
 *                 .expiration(ObjectStorageBucketLifecycleRuleExpirationArgs.builder()
 *                     .date(&#34;2021-06-21&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Linodes Object Storage Buckets can be imported using the resource `id` which is made of `cluster:label`, e.g.
 * 
 * ```sh
 *  $ pulumi import linode:index/objectStorageBucket:ObjectStorageBucket mybucket us-east-1:foobar
 * ```
 * 
 */
@ResourceType(type="linode:index/objectStorageBucket:ObjectStorageBucket")
public class ObjectStorageBucket extends com.pulumi.resources.CustomResource {
    /**
     * The access key to authenticate with.
     * 
     */
    @Export(name="accessKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> accessKey;

    /**
     * @return The access key to authenticate with.
     * 
     */
    public Output<Optional<String>> accessKey() {
        return Codegen.optional(this.accessKey);
    }
    /**
     * The Access Control Level of the bucket using a canned ACL string. See all ACL strings in the Linode API v4 documentation.
     * 
     */
    @Export(name="acl", type=String.class, parameters={})
    private Output</* @Nullable */ String> acl;

    /**
     * @return The Access Control Level of the bucket using a canned ACL string. See all ACL strings in the Linode API v4 documentation.
     * 
     */
    public Output<Optional<String>> acl() {
        return Codegen.optional(this.acl);
    }
    /**
     * The cert used by this Object Storage Bucket.
     * 
     */
    @Export(name="cert", type=ObjectStorageBucketCert.class, parameters={})
    private Output</* @Nullable */ ObjectStorageBucketCert> cert;

    /**
     * @return The cert used by this Object Storage Bucket.
     * 
     */
    public Output<Optional<ObjectStorageBucketCert>> cert() {
        return Codegen.optional(this.cert);
    }
    /**
     * The cluster of the Linode Object Storage Bucket.
     * 
     */
    @Export(name="cluster", type=String.class, parameters={})
    private Output<String> cluster;

    /**
     * @return The cluster of the Linode Object Storage Bucket.
     * 
     */
    public Output<String> cluster() {
        return this.cluster;
    }
    /**
     * If true, the bucket will have CORS enabled for all origins.
     * 
     */
    @Export(name="corsEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> corsEnabled;

    /**
     * @return If true, the bucket will have CORS enabled for all origins.
     * 
     */
    public Output<Optional<Boolean>> corsEnabled() {
        return Codegen.optional(this.corsEnabled);
    }
    /**
     * The hostname where this bucket can be accessed. This hostname can be accessed through a browser if the bucket is made
     * public.
     * 
     */
    @Export(name="hostname", type=String.class, parameters={})
    private Output<String> hostname;

    /**
     * @return The hostname where this bucket can be accessed. This hostname can be accessed through a browser if the bucket is made
     * public.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }
    /**
     * The label of the Linode Object Storage Bucket.
     * 
     */
    @Export(name="label", type=String.class, parameters={})
    private Output<String> label;

    /**
     * @return The label of the Linode Object Storage Bucket.
     * 
     */
    public Output<String> label() {
        return this.label;
    }
    /**
     * Lifecycle rules to be applied to the bucket.
     * 
     */
    @Export(name="lifecycleRules", type=List.class, parameters={ObjectStorageBucketLifecycleRule.class})
    private Output</* @Nullable */ List<ObjectStorageBucketLifecycleRule>> lifecycleRules;

    /**
     * @return Lifecycle rules to be applied to the bucket.
     * 
     */
    public Output<Optional<List<ObjectStorageBucketLifecycleRule>>> lifecycleRules() {
        return Codegen.optional(this.lifecycleRules);
    }
    /**
     * The secret key to authenticate with.
     * 
     */
    @Export(name="secretKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> secretKey;

    /**
     * @return The secret key to authenticate with.
     * 
     */
    public Output<Optional<String>> secretKey() {
        return Codegen.optional(this.secretKey);
    }
    /**
     * Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket. (Requires `access_key` and `secret_key`)
     * 
     */
    @Export(name="versioning", type=Boolean.class, parameters={})
    private Output<Boolean> versioning;

    /**
     * @return Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket. (Requires `access_key` and `secret_key`)
     * 
     */
    public Output<Boolean> versioning() {
        return this.versioning;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ObjectStorageBucket(String name) {
        this(name, ObjectStorageBucketArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ObjectStorageBucket(String name, ObjectStorageBucketArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ObjectStorageBucket(String name, ObjectStorageBucketArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/objectStorageBucket:ObjectStorageBucket", name, args == null ? ObjectStorageBucketArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ObjectStorageBucket(String name, Output<String> id, @Nullable ObjectStorageBucketState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/objectStorageBucket:ObjectStorageBucket", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ObjectStorageBucket get(String name, Output<String> id, @Nullable ObjectStorageBucketState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ObjectStorageBucket(name, id, state, options);
    }
}
