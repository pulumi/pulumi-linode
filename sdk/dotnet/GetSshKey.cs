// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetSshKey
    {
        /// <summary>
        /// `linode.SshKey` provides access to a specifically labeled SSH Key in the Profile of the User identified by the access token.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// The following example shows how the resource might be used to obtain the name of the SSH Key configured on the Linode user profile.
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var foo = Output.Create(Linode.GetSshKey.InvokeAsync(new Linode.GetSshKeyArgs
        ///         {
        ///             Label = "foo",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSshKeyResult> InvokeAsync(GetSshKeyArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetSshKeyResult>("linode:index/getSshKey:getSshKey", args ?? new GetSshKeyArgs(), options.WithVersion());
    }


    public sealed class GetSshKeyArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The label of the SSH Key to select.
        /// </summary>
        [Input("label", required: true)]
        public string Label { get; set; } = null!;

        public GetSshKeyArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetSshKeyResult
    {
        /// <summary>
        /// The date this key was added.
        /// </summary>
        public readonly string Created;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Label;
        /// <summary>
        /// The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
        /// </summary>
        public readonly string SshKey;

        [OutputConstructor]
        private GetSshKeyResult(
            string created,

            string id,

            string label,

            string sshKey)
        {
            Created = created;
            Id = id;
            Label = label;
            SshKey = sshKey;
        }
    }
}
