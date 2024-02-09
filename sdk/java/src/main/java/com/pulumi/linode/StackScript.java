// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.StackScriptArgs;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.inputs.StackScriptState;
import com.pulumi.linode.outputs.StackScriptUserDefinedField;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a Linode StackScript resource.  This can be used to create, modify, and delete Linode StackScripts.  StackScripts are private or public managed scripts which run within an instance during startup.  StackScripts can include variables whose values are specified when the Instance is created.
 * 
 * For more information, see [Automate Deployment with StackScripts](https://www.linode.com/docs/platform/stackscripts/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#tag/StackScripts).
 * 
 * ## Example Usage
 * 
 * The following example shows how one might use this resource to configure a StackScript attached to a Linode Instance.  As shown below, StackScripts must begin with a shebang (`#!`).  The `&lt;UDF ...&gt;` element provided in the Bash comment block defines a variable whose value is provided when creating the Instance (or disk) using the `stackscript_data` field.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.StackScript;
 * import com.pulumi.linode.StackScriptArgs;
 * import com.pulumi.linode.Instance;
 * import com.pulumi.linode.InstanceArgs;
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
 *         var fooStackScript = new StackScript(&#34;fooStackScript&#34;, StackScriptArgs.builder()        
 *             .label(&#34;foo&#34;)
 *             .description(&#34;Installs a Package&#34;)
 *             .script(&#34;&#34;&#34;
 * #!/bin/bash
 * # &lt;UDF name=&#34;package&#34; label=&#34;System Package to Install&#34; example=&#34;nginx&#34; default=&#34;&#34;&gt;
 * apt-get -q update &amp;&amp; apt-get -q -y install $PACKAGE
 *             &#34;&#34;&#34;)
 *             .images(            
 *                 &#34;linode/ubuntu18.04&#34;,
 *                 &#34;linode/ubuntu16.04lts&#34;)
 *             .revNote(&#34;initial version&#34;)
 *             .build());
 * 
 *         var fooInstance = new Instance(&#34;fooInstance&#34;, InstanceArgs.builder()        
 *             .image(&#34;linode/ubuntu18.04&#34;)
 *             .label(&#34;foo&#34;)
 *             .region(&#34;us-east&#34;)
 *             .type(&#34;g6-nanode-1&#34;)
 *             .authorizedKeys(&#34;...&#34;)
 *             .rootPass(&#34;...&#34;)
 *             .stackscriptId(fooStackScript.id())
 *             .stackscriptData(Map.of(&#34;package&#34;, &#34;nginx&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Linodes StackScripts can be imported using the Linode StackScript `id`, e.g.
 * 
 * ```sh
 * $ pulumi import linode:index/stackScript:StackScript mystackscript 1234567
 * ```
 * 
 */
@ResourceType(type="linode:index/stackScript:StackScript")
public class StackScript extends com.pulumi.resources.CustomResource {
    /**
     * The date this StackScript was created.
     * 
     */
    @Export(name="created", refs={String.class}, tree="[0]")
    private Output<String> created;

    /**
     * @return The date this StackScript was created.
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * Count of currently active, deployed Linodes created from this StackScript.
     * 
     */
    @Export(name="deploymentsActive", refs={Integer.class}, tree="[0]")
    private Output<Integer> deploymentsActive;

    /**
     * @return Count of currently active, deployed Linodes created from this StackScript.
     * 
     */
    public Output<Integer> deploymentsActive() {
        return this.deploymentsActive;
    }
    /**
     * The total number of times this StackScript has been deployed.
     * 
     */
    @Export(name="deploymentsTotal", refs={Integer.class}, tree="[0]")
    private Output<Integer> deploymentsTotal;

    /**
     * @return The total number of times this StackScript has been deployed.
     * 
     */
    public Output<Integer> deploymentsTotal() {
        return this.deploymentsTotal;
    }
    /**
     * A description for the StackScript.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return A description for the StackScript.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * A set of Image IDs representing the Images that this StackScript is compatible for deploying with. `any/all` indicates that all available image distributions, including private images, are accepted. Currently private image IDs are not supported.
     * 
     * ***
     * 
     */
    @Export(name="images", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> images;

    /**
     * @return A set of Image IDs representing the Images that this StackScript is compatible for deploying with. `any/all` indicates that all available image distributions, including private images, are accepted. Currently private image IDs are not supported.
     * 
     * ***
     * 
     */
    public Output<List<String>> images() {
        return this.images;
    }
    /**
     * This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private. *Changing `is_public` forces the creation of a new StackScript*
     * 
     */
    @Export(name="isPublic", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isPublic;

    /**
     * @return This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private. *Changing `is_public` forces the creation of a new StackScript*
     * 
     */
    public Output<Boolean> isPublic() {
        return this.isPublic;
    }
    /**
     * The StackScript&#39;s label is for display purposes only.
     * 
     */
    @Export(name="label", refs={String.class}, tree="[0]")
    private Output<String> label;

    /**
     * @return The StackScript&#39;s label is for display purposes only.
     * 
     */
    public Output<String> label() {
        return this.label;
    }
    /**
     * This field allows you to add notes for the set of revisions made to this StackScript.
     * 
     */
    @Export(name="revNote", refs={String.class}, tree="[0]")
    private Output<String> revNote;

    /**
     * @return This field allows you to add notes for the set of revisions made to this StackScript.
     * 
     */
    public Output<String> revNote() {
        return this.revNote;
    }
    /**
     * The script to execute when provisioning a new Linode with this StackScript.
     * 
     */
    @Export(name="script", refs={String.class}, tree="[0]")
    private Output<String> script;

    /**
     * @return The script to execute when provisioning a new Linode with this StackScript.
     * 
     */
    public Output<String> script() {
        return this.script;
    }
    /**
     * The date this StackScript was updated.
     * 
     */
    @Export(name="updated", refs={String.class}, tree="[0]")
    private Output<String> updated;

    /**
     * @return The date this StackScript was updated.
     * 
     */
    public Output<String> updated() {
        return this.updated;
    }
    /**
     * This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
     * 
     */
    @Export(name="userDefinedFields", refs={List.class,StackScriptUserDefinedField.class}, tree="[0,1]")
    private Output<List<StackScriptUserDefinedField>> userDefinedFields;

    /**
     * @return This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
     * 
     */
    public Output<List<StackScriptUserDefinedField>> userDefinedFields() {
        return this.userDefinedFields;
    }
    /**
     * The Gravatar ID for the User who created the StackScript.
     * 
     */
    @Export(name="userGravatarId", refs={String.class}, tree="[0]")
    private Output<String> userGravatarId;

    /**
     * @return The Gravatar ID for the User who created the StackScript.
     * 
     */
    public Output<String> userGravatarId() {
        return this.userGravatarId;
    }
    /**
     * The User who created the StackScript.
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output<String> username;

    /**
     * @return The User who created the StackScript.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StackScript(String name) {
        this(name, StackScriptArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StackScript(String name, StackScriptArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StackScript(String name, StackScriptArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/stackScript:StackScript", name, args == null ? StackScriptArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StackScript(String name, Output<String> id, @Nullable StackScriptState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/stackScript:StackScript", name, state, makeResourceOptions(options, id));
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
    public static StackScript get(String name, Output<String> id, @Nullable StackScriptState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StackScript(name, id, state, options);
    }
}
