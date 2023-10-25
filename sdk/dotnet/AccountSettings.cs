// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    /// <summary>
    /// Manages the settings of a Linode account.
    /// 
    /// ## Example Usage
    /// 
    /// The following example shows how one might use this resource to change their Linode account settings.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var myaccount = new Linode.AccountSettings("myaccount", new()
    ///     {
    ///         BackupsEnabled = true,
    ///         LongviewSubscription = "longview-40",
    ///     });
    /// 
    /// });
    /// ```
    /// ## Additional Results
    /// 
    /// * `managed` - Enables monitoring for connectivity, response, and total request time.
    /// 
    /// * `object_storage` - A string describing the status of this account’s Object Storage service enrollment.
    /// </summary>
    [LinodeResourceType("linode:index/accountSettings:AccountSettings")]
    public partial class AccountSettings : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account-wide backups default. If true, all Linodes created will automatically be enrolled in the Backups service. If false, Linodes will not be enrolled by default, but may still be enrolled on creation or later.
        /// </summary>
        [Output("backupsEnabled")]
        public Output<bool> BackupsEnabled { get; private set; } = null!;

        /// <summary>
        /// The Longview Pro tier you are currently subscribed to. The value must be a [Longview Subscription](https://www.linode.com/docs/api/longview/#longview-subscriptions-list) ID or null for Longview Free.
        /// </summary>
        [Output("longviewSubscription")]
        public Output<string> LongviewSubscription { get; private set; } = null!;

        /// <summary>
        /// Enables monitoring for connectivity, response, and total request time.
        /// </summary>
        [Output("managed")]
        public Output<bool> Managed { get; private set; } = null!;

        /// <summary>
        /// Enables network helper across all users by default for new Linodes and Linode Configs.
        /// </summary>
        [Output("networkHelper")]
        public Output<bool> NetworkHelper { get; private set; } = null!;

        /// <summary>
        /// A string describing the status of this account's Object Storage service enrollment.
        /// </summary>
        [Output("objectStorage")]
        public Output<string> ObjectStorage { get; private set; } = null!;


        /// <summary>
        /// Create a AccountSettings resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccountSettings(string name, AccountSettingsArgs? args = null, CustomResourceOptions? options = null)
            : base("linode:index/accountSettings:AccountSettings", name, args ?? new AccountSettingsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccountSettings(string name, Input<string> id, AccountSettingsState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/accountSettings:AccountSettings", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AccountSettings resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccountSettings Get(string name, Input<string> id, AccountSettingsState? state = null, CustomResourceOptions? options = null)
        {
            return new AccountSettings(name, id, state, options);
        }
    }

    public sealed class AccountSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account-wide backups default. If true, all Linodes created will automatically be enrolled in the Backups service. If false, Linodes will not be enrolled by default, but may still be enrolled on creation or later.
        /// </summary>
        [Input("backupsEnabled")]
        public Input<bool>? BackupsEnabled { get; set; }

        /// <summary>
        /// The Longview Pro tier you are currently subscribed to. The value must be a [Longview Subscription](https://www.linode.com/docs/api/longview/#longview-subscriptions-list) ID or null for Longview Free.
        /// </summary>
        [Input("longviewSubscription")]
        public Input<string>? LongviewSubscription { get; set; }

        /// <summary>
        /// Enables network helper across all users by default for new Linodes and Linode Configs.
        /// </summary>
        [Input("networkHelper")]
        public Input<bool>? NetworkHelper { get; set; }

        public AccountSettingsArgs()
        {
        }
        public static new AccountSettingsArgs Empty => new AccountSettingsArgs();
    }

    public sealed class AccountSettingsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account-wide backups default. If true, all Linodes created will automatically be enrolled in the Backups service. If false, Linodes will not be enrolled by default, but may still be enrolled on creation or later.
        /// </summary>
        [Input("backupsEnabled")]
        public Input<bool>? BackupsEnabled { get; set; }

        /// <summary>
        /// The Longview Pro tier you are currently subscribed to. The value must be a [Longview Subscription](https://www.linode.com/docs/api/longview/#longview-subscriptions-list) ID or null for Longview Free.
        /// </summary>
        [Input("longviewSubscription")]
        public Input<string>? LongviewSubscription { get; set; }

        /// <summary>
        /// Enables monitoring for connectivity, response, and total request time.
        /// </summary>
        [Input("managed")]
        public Input<bool>? Managed { get; set; }

        /// <summary>
        /// Enables network helper across all users by default for new Linodes and Linode Configs.
        /// </summary>
        [Input("networkHelper")]
        public Input<bool>? NetworkHelper { get; set; }

        /// <summary>
        /// A string describing the status of this account's Object Storage service enrollment.
        /// </summary>
        [Input("objectStorage")]
        public Input<string>? ObjectStorage { get; set; }

        public AccountSettingsState()
        {
        }
        public static new AccountSettingsState Empty => new AccountSettingsState();
    }
}
