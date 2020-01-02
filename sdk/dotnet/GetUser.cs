// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static partial class Invokes
    {
        /// <summary>
        /// Provides information about a Linode user
        /// 
        /// ## Attributes
        /// 
        /// The Linode User resource exports the following attributes:
        /// 
        /// * `ssh_keys` - A list of SSH Key labels added by this User. These are the keys that will be deployed if this User is included in the authorized_users field of a create Linode, rebuild Linode, or create Disk request.
        /// 
        /// * `email` - The email address for this User, for account management communications, and may be used for other communications as configured.
        /// 
        /// * `restricted` - If true, this User must be granted access to perform actions or access entities on this Account.
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-linode/blob/master/website/docs/d/user.html.markdown.
        /// </summary>
        public static Task<GetUserResult> GetUser(GetUserArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetUserResult>("linode:index/getUser:getUser", args ?? InvokeArgs.Empty, options.WithVersion());
    }

    public sealed class GetUserArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique username of this User.
        /// </summary>
        [Input("username", required: true)]
        public string Username { get; set; } = null!;

        public GetUserArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetUserResult
    {
        public readonly string Email;
        public readonly bool Restricted;
        public readonly ImmutableArray<string> SshKeys;
        public readonly string Username;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetUserResult(
            string email,
            bool restricted,
            ImmutableArray<string> sshKeys,
            string username,
            string id)
        {
            Email = email;
            Restricted = restricted;
            SshKeys = sshKeys;
            Username = username;
            Id = id;
        }
    }
}
