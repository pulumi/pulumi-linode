// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.DatabaseMysqlArgs;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.inputs.DatabaseMysqlState;
import com.pulumi.linode.outputs.DatabaseMysqlUpdates;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Linode MySQL Database resource. This can be used to create, modify, and delete Linode MySQL Databases.
 * For more information, see the [Linode APIv4 docs](https://www.linode.com/docs/api/databases/).
 * 
 * Please keep in mind that Managed Databases can take up to an hour to provision.
 * 
 * ## Example Usage
 * 
 * Creating a simple MySQL database instance:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.DatabaseMysql;
 * import com.pulumi.linode.DatabaseMysqlArgs;
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
 *         var foobar = new DatabaseMysql(&#34;foobar&#34;, DatabaseMysqlArgs.builder()        
 *             .engineId(&#34;mysql/8.0.26&#34;)
 *             .label(&#34;mydatabase&#34;)
 *             .region(&#34;us-southeast&#34;)
 *             .type(&#34;g6-nanode-1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Creating a complex MySQL database instance:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.DatabaseMysql;
 * import com.pulumi.linode.DatabaseMysqlArgs;
 * import com.pulumi.linode.inputs.DatabaseMysqlUpdatesArgs;
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
 *         var foobar = new DatabaseMysql(&#34;foobar&#34;, DatabaseMysqlArgs.builder()        
 *             .allowLists(&#34;0.0.0.0/0&#34;)
 *             .clusterSize(3)
 *             .encrypted(true)
 *             .engineId(&#34;mysql/8.0.26&#34;)
 *             .label(&#34;mydatabase&#34;)
 *             .region(&#34;us-southeast&#34;)
 *             .replicationType(&#34;asynch&#34;)
 *             .sslConnection(true)
 *             .type(&#34;g6-nanode-1&#34;)
 *             .updates(DatabaseMysqlUpdatesArgs.builder()
 *                 .dayOfWeek(&#34;saturday&#34;)
 *                 .duration(1)
 *                 .frequency(&#34;monthly&#34;)
 *                 .hourOfDay(22)
 *                 .weekOfMonth(2)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## updates
 * 
 * The following arguments are supported in the `updates` specification block:
 * 
 * * `day_of_week` - (Required) The day to perform maintenance. (`monday`, `tuesday`, ...)
 * 
 * * `duration` - (Required) The maximum maintenance window time in hours. (`1`..`3`)
 * 
 * * `frequency` - (Required) Whether maintenance occurs on a weekly or monthly basis. (`weekly`, `monthly`)
 * 
 * * `hour_of_day` - (Required) The hour to begin maintenance based in UTC time. (`0`..`23`)
 * 
 * * `week_of_month` - (Optional) The week of the month to perform monthly frequency updates. Required for `monthly` frequency updates. (`1`..`4`)
 * 
 * ## Import
 * 
 * Linode MySQL Databases can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import linode:index/databaseMysql:DatabaseMysql foobar 1234567
 * ```
 * 
 */
@ResourceType(type="linode:index/databaseMysql:DatabaseMysql")
public class DatabaseMysql extends com.pulumi.resources.CustomResource {
    /**
     * A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `linode.DatabaseAccessControls` to manage your allow list separately.
     * 
     */
    @Export(name="allowLists", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> allowLists;

    /**
     * @return A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `linode.DatabaseAccessControls` to manage your allow list separately.
     * 
     */
    public Output<List<String>> allowLists() {
        return this.allowLists;
    }
    /**
     * The base64-encoded SSL CA certificate for the Managed Database instance.
     * 
     */
    @Export(name="caCert", refs={String.class}, tree="[0]")
    private Output<String> caCert;

    /**
     * @return The base64-encoded SSL CA certificate for the Managed Database instance.
     * 
     */
    public Output<String> caCert() {
        return this.caCert;
    }
    /**
     * The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
     * 
     */
    @Export(name="clusterSize", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> clusterSize;

    /**
     * @return The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
     * 
     */
    public Output<Optional<Integer>> clusterSize() {
        return Codegen.optional(this.clusterSize);
    }
    /**
     * When this Managed Database was created.
     * 
     */
    @Export(name="created", refs={String.class}, tree="[0]")
    private Output<String> created;

    /**
     * @return When this Managed Database was created.
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * Whether the Managed Databases is encrypted. (default `false`)
     * 
     */
    @Export(name="encrypted", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> encrypted;

    /**
     * @return Whether the Managed Databases is encrypted. (default `false`)
     * 
     */
    public Output<Optional<Boolean>> encrypted() {
        return Codegen.optional(this.encrypted);
    }
    /**
     * The Managed Database engine. (e.g. `mysql`)
     * 
     */
    @Export(name="engine", refs={String.class}, tree="[0]")
    private Output<String> engine;

    /**
     * @return The Managed Database engine. (e.g. `mysql`)
     * 
     */
    public Output<String> engine() {
        return this.engine;
    }
    /**
     * The Managed Database engine in engine/version format. (e.g. `mysql/8.0.26`)
     * 
     */
    @Export(name="engineId", refs={String.class}, tree="[0]")
    private Output<String> engineId;

    /**
     * @return The Managed Database engine in engine/version format. (e.g. `mysql/8.0.26`)
     * 
     */
    public Output<String> engineId() {
        return this.engineId;
    }
    /**
     * The primary host for the Managed Database.
     * 
     */
    @Export(name="hostPrimary", refs={String.class}, tree="[0]")
    private Output<String> hostPrimary;

    /**
     * @return The primary host for the Managed Database.
     * 
     */
    public Output<String> hostPrimary() {
        return this.hostPrimary;
    }
    /**
     * The secondary/private network host for the Managed Database.
     * 
     */
    @Export(name="hostSecondary", refs={String.class}, tree="[0]")
    private Output<String> hostSecondary;

    /**
     * @return The secondary/private network host for the Managed Database.
     * 
     */
    public Output<String> hostSecondary() {
        return this.hostSecondary;
    }
    /**
     * A unique, user-defined string referring to the Managed Database.
     * 
     */
    @Export(name="label", refs={String.class}, tree="[0]")
    private Output<String> label;

    /**
     * @return A unique, user-defined string referring to the Managed Database.
     * 
     */
    public Output<String> label() {
        return this.label;
    }
    /**
     * The region to use for the Managed Database.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The region to use for the Managed Database.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The replication method used for the Managed Database. (`none`, `asynch`, `semi_synch`; default `none`)
     * 
     * * Must be `none` for a single node cluster.
     * 
     * * Must be `asynch` or `semi_synch` for a high availability cluster.
     * 
     */
    @Export(name="replicationType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> replicationType;

    /**
     * @return The replication method used for the Managed Database. (`none`, `asynch`, `semi_synch`; default `none`)
     * 
     * * Must be `none` for a single node cluster.
     * 
     * * Must be `asynch` or `semi_synch` for a high availability cluster.
     * 
     */
    public Output<Optional<String>> replicationType() {
        return Codegen.optional(this.replicationType);
    }
    /**
     * The randomly-generated root password for the Managed Database instance.
     * 
     */
    @Export(name="rootPassword", refs={String.class}, tree="[0]")
    private Output<String> rootPassword;

    /**
     * @return The randomly-generated root password for the Managed Database instance.
     * 
     */
    public Output<String> rootPassword() {
        return this.rootPassword;
    }
    /**
     * The root username for the Managed Database instance.
     * 
     */
    @Export(name="rootUsername", refs={String.class}, tree="[0]")
    private Output<String> rootUsername;

    /**
     * @return The root username for the Managed Database instance.
     * 
     */
    public Output<String> rootUsername() {
        return this.rootUsername;
    }
    /**
     * Whether to require SSL credentials to establish a connection to the Managed Database. (default `false`)
     * 
     * * `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
     * 
     */
    @Export(name="sslConnection", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> sslConnection;

    /**
     * @return Whether to require SSL credentials to establish a connection to the Managed Database. (default `false`)
     * 
     * * `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
     * 
     */
    public Output<Optional<Boolean>> sslConnection() {
        return Codegen.optional(this.sslConnection);
    }
    /**
     * The operating status of the Managed Database.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The operating status of the Managed Database.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The Linode Instance type used for the nodes of the  Managed Database instance.
     * 
     * ***
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The Linode Instance type used for the nodes of the  Managed Database instance.
     * 
     * ***
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * When this Managed Database was last updated.
     * 
     */
    @Export(name="updated", refs={String.class}, tree="[0]")
    private Output<String> updated;

    /**
     * @return When this Managed Database was last updated.
     * 
     */
    public Output<String> updated() {
        return this.updated;
    }
    /**
     * Configuration settings for automated patch update maintenance for the Managed Database.
     * 
     */
    @Export(name="updates", refs={DatabaseMysqlUpdates.class}, tree="[0]")
    private Output<DatabaseMysqlUpdates> updates;

    /**
     * @return Configuration settings for automated patch update maintenance for the Managed Database.
     * 
     */
    public Output<DatabaseMysqlUpdates> updates() {
        return this.updates;
    }
    /**
     * The Managed Database engine version. (e.g. `v8.0.26`)
     * 
     */
    @Export(name="version", refs={String.class}, tree="[0]")
    private Output<String> version;

    /**
     * @return The Managed Database engine version. (e.g. `v8.0.26`)
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseMysql(String name) {
        this(name, DatabaseMysqlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseMysql(String name, DatabaseMysqlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseMysql(String name, DatabaseMysqlArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/databaseMysql:DatabaseMysql", name, args == null ? DatabaseMysqlArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatabaseMysql(String name, Output<String> id, @Nullable DatabaseMysqlState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/databaseMysql:DatabaseMysql", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "caCert",
                "rootPassword",
                "rootUsername"
            ))
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
    public static DatabaseMysql get(String name, Output<String> id, @Nullable DatabaseMysqlState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseMysql(name, id, state, options);
    }
}
