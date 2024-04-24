// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetAccountAvailability
    {
        /// <summary>
        /// Provides details about service availability in a region to an account specifically.
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about a Linode account availability.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myAccountAvailability = Linode.GetAccountAvailability.Invoke(new()
        ///     {
        ///         Region = "us-east",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetAccountAvailabilityResult> InvokeAsync(GetAccountAvailabilityArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAccountAvailabilityResult>("linode:index/getAccountAvailability:getAccountAvailability", args ?? new GetAccountAvailabilityArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about service availability in a region to an account specifically.
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about a Linode account availability.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myAccountAvailability = Linode.GetAccountAvailability.Invoke(new()
        ///     {
        ///         Region = "us-east",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAccountAvailabilityResult> Invoke(GetAccountAvailabilityInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccountAvailabilityResult>("linode:index/getAccountAvailability:getAccountAvailability", args ?? new GetAccountAvailabilityInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAccountAvailabilityArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The region ID.
        /// </summary>
        [Input("region", required: true)]
        public string Region { get; set; } = null!;

        public GetAccountAvailabilityArgs()
        {
        }
        public static new GetAccountAvailabilityArgs Empty => new GetAccountAvailabilityArgs();
    }

    public sealed class GetAccountAvailabilityInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The region ID.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public GetAccountAvailabilityInvokeArgs()
        {
        }
        public static new GetAccountAvailabilityInvokeArgs Empty => new GetAccountAvailabilityInvokeArgs();
    }


    [OutputType]
    public sealed class GetAccountAvailabilityResult
    {
        /// <summary>
        /// A set of services which are available to the account in a region.
        /// </summary>
        public readonly ImmutableArray<string> Availables;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The region ID.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// A set of services which are unavailable to the account in a region.
        /// </summary>
        public readonly ImmutableArray<string> Unavailables;

        [OutputConstructor]
        private GetAccountAvailabilityResult(
            ImmutableArray<string> availables,

            string id,

            string region,

            ImmutableArray<string> unavailables)
        {
            Availables = availables;
            Id = id;
            Region = region;
            Unavailables = unavailables;
        }
    }
}
