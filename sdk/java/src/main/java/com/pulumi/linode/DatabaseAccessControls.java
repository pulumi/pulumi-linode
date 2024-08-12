// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.DatabaseAccessControlsArgs;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.inputs.DatabaseAccessControlsState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages the access control for a Linode Database. Only one `linode.DatabaseAccessControls` resource should be defined per-database.
 * For more information, see the Linode APIv4 docs for [MySQL](https://techdocs.akamai.com/linode-api/reference/put-databases-mysql-instance) and [PostgreSQL](https://techdocs.akamai.com/linode-api/reference/put-databases-postgre-sql-instance).
 * 
 * ## Example Usage
 * 
 * Grant a Linode access to a database:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.Instance;
 * import com.pulumi.linode.InstanceArgs;
 * import com.pulumi.linode.DatabaseMysql;
 * import com.pulumi.linode.DatabaseMysqlArgs;
 * import com.pulumi.linode.DatabaseAccessControls;
 * import com.pulumi.linode.DatabaseAccessControlsArgs;
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
 *         var my_instance = new Instance("my-instance", InstanceArgs.builder()
 *             .label("myinstance")
 *             .region("us-southeast")
 *             .type("g6-nanode-1")
 *             .image("linode/alpine3.19")
 *             .build());
 * 
 *         var my_db = new DatabaseMysql("my-db", DatabaseMysqlArgs.builder()
 *             .label("mydatabase")
 *             .engineId("mysql/8.0.30")
 *             .region("us-southeast")
 *             .type("g6-nanode-1")
 *             .build());
 * 
 *         var my_access = new DatabaseAccessControls("my-access", DatabaseAccessControlsArgs.builder()
 *             .databaseId(my_db.id())
 *             .databaseType("mysql")
 *             .allowLists(my_instance.ipAddress())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="linode:index/databaseAccessControls:DatabaseAccessControls")
public class DatabaseAccessControls extends com.pulumi.resources.CustomResource {
    /**
     * A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
     * 
     */
    @Export(name="allowLists", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> allowLists;

    /**
     * @return A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
     * 
     */
    public Output<List<String>> allowLists() {
        return this.allowLists;
    }
    /**
     * The unique ID of the target database.
     * 
     */
    @Export(name="databaseId", refs={Integer.class}, tree="[0]")
    private Output<Integer> databaseId;

    /**
     * @return The unique ID of the target database.
     * 
     */
    public Output<Integer> databaseId() {
        return this.databaseId;
    }
    /**
     * The unique type of the target database. (`mysql`, `postgresql`)
     * 
     */
    @Export(name="databaseType", refs={String.class}, tree="[0]")
    private Output<String> databaseType;

    /**
     * @return The unique type of the target database. (`mysql`, `postgresql`)
     * 
     */
    public Output<String> databaseType() {
        return this.databaseType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseAccessControls(java.lang.String name) {
        this(name, DatabaseAccessControlsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseAccessControls(java.lang.String name, DatabaseAccessControlsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseAccessControls(java.lang.String name, DatabaseAccessControlsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/databaseAccessControls:DatabaseAccessControls", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DatabaseAccessControls(java.lang.String name, Output<java.lang.String> id, @Nullable DatabaseAccessControlsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/databaseAccessControls:DatabaseAccessControls", name, state, makeResourceOptions(options, id), false);
    }

    private static DatabaseAccessControlsArgs makeArgs(DatabaseAccessControlsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DatabaseAccessControlsArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static DatabaseAccessControls get(java.lang.String name, Output<java.lang.String> id, @Nullable DatabaseAccessControlsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseAccessControls(name, id, state, options);
    }
}
