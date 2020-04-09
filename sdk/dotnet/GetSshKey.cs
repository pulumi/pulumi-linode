// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static partial class Invokes
    {
        /// <summary>
        /// `linode..SshKey` provides access to a specifically labeled SSH Key in the Profile of the User identified by the access token.
        /// 
        /// 
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-linode/blob/master/website/docs/d/sshkey.html.md.
        /// </summary>
        [Obsolete("Use GetSshKey.InvokeAsync() instead")]
        public static Task<GetSshKeyResult> GetSshKey(GetSshKeyArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetSshKeyResult>("linode:index/getSshKey:getSshKey", args ?? InvokeArgs.Empty, options.WithVersion());
    }
    public static class GetSshKey
    {
        /// <summary>
        /// `linode..SshKey` provides access to a specifically labeled SSH Key in the Profile of the User identified by the access token.
        /// 
        /// 
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-linode/blob/master/website/docs/d/sshkey.html.md.
        /// </summary>
        public static Task<GetSshKeyResult> InvokeAsync(GetSshKeyArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetSshKeyResult>("linode:index/getSshKey:getSshKey", args ?? InvokeArgs.Empty, options.WithVersion());
    }

    public sealed class GetSshKeyArgs : Pulumi.InvokeArgs
    {
        [Input("label", required: true)]
        public string Label { get; set; } = null!;

        public GetSshKeyArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetSshKeyResult
    {
        public readonly string Created;
        public readonly string Label;
        public readonly string SshKey;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetSshKeyResult(
            string created,
            string label,
            string sshKey,
            string id)
        {
            Created = created;
            Label = label;
            SshKey = sshKey;
            Id = id;
        }
    }
}
