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
    /// The provider type for the linode package. By default, resources use package-wide configuration
    /// settings, however an explicit `Provider` instance may be created and passed during resource
    /// construction to achieve fine-grained programmatic control over provider settings. See the
    /// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
    /// </summary>
    [LinodeResourceType("pulumi:providers:linode")]
    public partial class Provider : Pulumi.ProviderResource
    {
        /// <summary>
        /// Create a Provider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Provider(string name, ProviderArgs args, CustomResourceOptions? options = null)
            : base("linode", name, args ?? new ProviderArgs(), MakeResourceOptions(options, ""))
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
    }

    public sealed class ProviderArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// An HTTP User-Agent Prefix to prepend in API requests.
        /// </summary>
        [Input("apiVersion")]
        public Input<string>? ApiVersion { get; set; }

        /// <summary>
        /// Maximum delay in milliseconds before retrying a request.
        /// </summary>
        [Input("maxRetryDelayMs", json: true)]
        public Input<int>? MaxRetryDelayMs { get; set; }

        /// <summary>
        /// Minimum delay in milliseconds before retrying a request.
        /// </summary>
        [Input("minRetryDelayMs", json: true)]
        public Input<int>? MinRetryDelayMs { get; set; }

        /// <summary>
        /// Skip waiting for a linode_instance resource to be running.
        /// </summary>
        [Input("skipInstanceReadyPoll", json: true)]
        public Input<bool>? SkipInstanceReadyPoll { get; set; }

        /// <summary>
        /// The token that allows you access to your Linode account
        /// </summary>
        [Input("token", required: true)]
        public Input<string> Token { get; set; } = null!;

        /// <summary>
        /// An HTTP User-Agent Prefix to prepend in API requests.
        /// </summary>
        [Input("uaPrefix")]
        public Input<string>? UaPrefix { get; set; }

        /// <summary>
        /// The HTTP(S) API address of the Linode API to use.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public ProviderArgs()
        {
            ApiVersion = Utilities.GetEnv("LINODE_API_VERSION");
            UaPrefix = Utilities.GetEnv("LINODE_UA_PREFIX");
            Url = Utilities.GetEnv("LINODE_URL");
        }
    }
}
