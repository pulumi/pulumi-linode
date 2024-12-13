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
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-ssh-key).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how the resource might be used to obtain the name of the SSH Key configured on the Linode user profile.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Linode.GetSshKey.Invoke(new()
        ///     {
        ///         Label = "foo",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetSshKeyResult> InvokeAsync(GetSshKeyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSshKeyResult>("linode:index/getSshKey:getSshKey", args ?? new GetSshKeyArgs(), options.WithDefaults());

        /// <summary>
        /// `linode.SshKey` provides access to a specifically labeled SSH Key in the Profile of the User identified by the access token.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-ssh-key).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how the resource might be used to obtain the name of the SSH Key configured on the Linode user profile.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Linode.GetSshKey.Invoke(new()
        ///     {
        ///         Label = "foo",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSshKeyResult> Invoke(GetSshKeyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSshKeyResult>("linode:index/getSshKey:getSshKey", args ?? new GetSshKeyInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// `linode.SshKey` provides access to a specifically labeled SSH Key in the Profile of the User identified by the access token.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-ssh-key).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how the resource might be used to obtain the name of the SSH Key configured on the Linode user profile.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Linode.GetSshKey.Invoke(new()
        ///     {
        ///         Label = "foo",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSshKeyResult> Invoke(GetSshKeyInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSshKeyResult>("linode:index/getSshKey:getSshKey", args ?? new GetSshKeyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSshKeyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the SSH Key
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// The label of the SSH Key to select.
        /// </summary>
        [Input("label", required: true)]
        public string Label { get; set; } = null!;

        public GetSshKeyArgs()
        {
        }
        public static new GetSshKeyArgs Empty => new GetSshKeyArgs();
    }

    public sealed class GetSshKeyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the SSH Key
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The label of the SSH Key to select.
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        public GetSshKeyInvokeArgs()
        {
        }
        public static new GetSshKeyInvokeArgs Empty => new GetSshKeyInvokeArgs();
    }


    [OutputType]
    public sealed class GetSshKeyResult
    {
        /// <summary>
        /// The date this key was added.
        /// </summary>
        public readonly string Created;
        /// <summary>
        /// The ID of the SSH Key
        /// </summary>
        public readonly string? Id;
        public readonly string Label;
        /// <summary>
        /// The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
        /// </summary>
        public readonly string SshKey;

        [OutputConstructor]
        private GetSshKeyResult(
            string created,

            string? id,

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
