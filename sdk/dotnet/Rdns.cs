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
    /// Provides a Linode RDNS resource.  This can be used to create and modify RDNS records.
    /// 
    /// Linode RDNS names must have a matching address value in an A or AAAA record.  This A or AAAA name must be resolvable at the time the RDNS resource is being associated.
    /// 
    /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/put-ip) and the [Configure your Linode for Reverse DNS](https://www.linode.com/docs/networking/dns/configure-your-linode-for-reverse-dns-classic-manager/) guide.
    /// 
    /// ## Example Usage
    /// 
    /// The following example shows how one might use this resource to configure an RDNS address for an IP address.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var fooInstance = new Linode.Instance("foo", new()
    ///     {
    ///         Image = "linode/alpine3.19",
    ///         Region = "ca-east",
    ///         Type = "g6-dedicated-2",
    ///     });
    /// 
    ///     var foo = new Linode.Rdns("foo", new()
    ///     {
    ///         Address = fooInstance.IpAddress,
    ///         RdnsName = fooInstance.IpAddress.Apply(ipAddress =&gt; $"{ipAddress}.nip.io"),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// The following example shows how one might use this resource to configure RDNS for multiple IP addresses.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var myInstance = new List&lt;Linode.Instance&gt;();
    ///     for (var rangeIndex = 0; rangeIndex &lt; 3; rangeIndex++)
    ///     {
    ///         var range = new { Value = rangeIndex };
    ///         myInstance.Add(new Linode.Instance($"my_instance-{range.Value}", new()
    ///         {
    ///             Label = $"simple_instance-{range.Value + 1}",
    ///             Image = "linode/ubuntu22.04",
    ///             Region = "us-central",
    ///             Type = "g6-standard-1",
    ///             RootPass = "terr4form-test",
    ///         }));
    ///     }
    ///     var myRdns = new List&lt;Linode.Rdns&gt;();
    ///     for (var rangeIndex = 0; rangeIndex &lt; myInstance.Length; rangeIndex++)
    ///     {
    ///         var range = new { Value = rangeIndex };
    ///         myRdns.Add(new Linode.Rdns($"my_rdns-{range.Value}", new()
    ///         {
    ///             Address = myInstance[range.Value].IpAddress,
    ///             RdnsName = myInstance[range.Value].IpAddress.Apply(ipAddress =&gt; $"{ipAddress}.nip.io"),
    ///         }));
    ///     }
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Linodes RDNS resources can be imported using the address as the `id`.
    /// 
    /// ```sh
    /// $ pulumi import linode:index/rdns:Rdns foo 123.123.123.123
    /// ```
    /// </summary>
    [LinodeResourceType("linode:index/rdns:Rdns")]
    public partial class Rdns : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
        /// </summary>
        [Output("address")]
        public Output<string> Address { get; private set; } = null!;

        /// <summary>
        /// The name of the RDNS address.
        /// </summary>
        [Output("rdns")]
        public Output<string> RdnsName { get; private set; } = null!;

        [Output("timeouts")]
        public Output<Outputs.RdnsTimeouts?> Timeouts { get; private set; } = null!;

        /// <summary>
        /// If true, the RDNS assignment will be retried within the operation timeout period.
        /// </summary>
        [Output("waitForAvailable")]
        public Output<bool> WaitForAvailable { get; private set; } = null!;


        /// <summary>
        /// Create a Rdns resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Rdns(string name, RdnsArgs args, CustomResourceOptions? options = null)
            : base("linode:index/rdns:Rdns", name, args ?? new RdnsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Rdns(string name, Input<string> id, RdnsState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/rdns:Rdns", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Rdns resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Rdns Get(string name, Input<string> id, RdnsState? state = null, CustomResourceOptions? options = null)
        {
            return new Rdns(name, id, state, options);
        }
    }

    public sealed class RdnsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        /// <summary>
        /// The name of the RDNS address.
        /// </summary>
        [Input("rdns", required: true)]
        public Input<string> RdnsName { get; set; } = null!;

        [Input("timeouts")]
        public Input<Inputs.RdnsTimeoutsArgs>? Timeouts { get; set; }

        /// <summary>
        /// If true, the RDNS assignment will be retried within the operation timeout period.
        /// </summary>
        [Input("waitForAvailable")]
        public Input<bool>? WaitForAvailable { get; set; }

        public RdnsArgs()
        {
        }
        public static new RdnsArgs Empty => new RdnsArgs();
    }

    public sealed class RdnsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// The name of the RDNS address.
        /// </summary>
        [Input("rdns")]
        public Input<string>? RdnsName { get; set; }

        [Input("timeouts")]
        public Input<Inputs.RdnsTimeoutsGetArgs>? Timeouts { get; set; }

        /// <summary>
        /// If true, the RDNS assignment will be retried within the operation timeout period.
        /// </summary>
        [Input("waitForAvailable")]
        public Input<bool>? WaitForAvailable { get; set; }

        public RdnsState()
        {
        }
        public static new RdnsState Empty => new RdnsState();
    }
}
