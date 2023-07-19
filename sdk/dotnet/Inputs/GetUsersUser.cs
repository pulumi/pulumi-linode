// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetUsersUserArgs : global::Pulumi.InvokeArgs
    {
        [Input("databaseGrants", required: true)]
        private List<Inputs.GetUsersUserDatabaseGrantArgs>? _databaseGrants;
        public List<Inputs.GetUsersUserDatabaseGrantArgs> DatabaseGrants
        {
            get => _databaseGrants ?? (_databaseGrants = new List<Inputs.GetUsersUserDatabaseGrantArgs>());
            set => _databaseGrants = value;
        }

        [Input("domainGrants", required: true)]
        private List<Inputs.GetUsersUserDomainGrantArgs>? _domainGrants;
        public List<Inputs.GetUsersUserDomainGrantArgs> DomainGrants
        {
            get => _domainGrants ?? (_domainGrants = new List<Inputs.GetUsersUserDomainGrantArgs>());
            set => _domainGrants = value;
        }

        /// <summary>
        /// The email address for this User, for account management communications, and may be used for other communications as configured.
        /// </summary>
        [Input("email", required: true)]
        public string Email { get; set; } = null!;

        [Input("firewallGrants", required: true)]
        private List<Inputs.GetUsersUserFirewallGrantArgs>? _firewallGrants;
        public List<Inputs.GetUsersUserFirewallGrantArgs> FirewallGrants
        {
            get => _firewallGrants ?? (_firewallGrants = new List<Inputs.GetUsersUserFirewallGrantArgs>());
            set => _firewallGrants = value;
        }

        [Input("globalGrants", required: true)]
        private List<Inputs.GetUsersUserGlobalGrantArgs>? _globalGrants;
        public List<Inputs.GetUsersUserGlobalGrantArgs> GlobalGrants
        {
            get => _globalGrants ?? (_globalGrants = new List<Inputs.GetUsersUserGlobalGrantArgs>());
            set => _globalGrants = value;
        }

        /// <summary>
        /// The ID of entity this grant applies to.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        [Input("imageGrants", required: true)]
        private List<Inputs.GetUsersUserImageGrantArgs>? _imageGrants;
        public List<Inputs.GetUsersUserImageGrantArgs> ImageGrants
        {
            get => _imageGrants ?? (_imageGrants = new List<Inputs.GetUsersUserImageGrantArgs>());
            set => _imageGrants = value;
        }

        [Input("linodeGrants", required: true)]
        private List<Inputs.GetUsersUserLinodeGrantArgs>? _linodeGrants;
        public List<Inputs.GetUsersUserLinodeGrantArgs> LinodeGrants
        {
            get => _linodeGrants ?? (_linodeGrants = new List<Inputs.GetUsersUserLinodeGrantArgs>());
            set => _linodeGrants = value;
        }

        [Input("longviewGrants", required: true)]
        private List<Inputs.GetUsersUserLongviewGrantArgs>? _longviewGrants;
        public List<Inputs.GetUsersUserLongviewGrantArgs> LongviewGrants
        {
            get => _longviewGrants ?? (_longviewGrants = new List<Inputs.GetUsersUserLongviewGrantArgs>());
            set => _longviewGrants = value;
        }

        [Input("nodebalancerGrants", required: true)]
        private List<Inputs.GetUsersUserNodebalancerGrantArgs>? _nodebalancerGrants;
        public List<Inputs.GetUsersUserNodebalancerGrantArgs> NodebalancerGrants
        {
            get => _nodebalancerGrants ?? (_nodebalancerGrants = new List<Inputs.GetUsersUserNodebalancerGrantArgs>());
            set => _nodebalancerGrants = value;
        }

        /// <summary>
        /// The date and time when this User’s current password was created. User passwords are first created during the Account sign-up process, and updated using the Reset Password webpage. null if this User has not created a password yet.
        /// </summary>
        [Input("passwordCreated", required: true)]
        public string PasswordCreated { get; set; } = null!;

        /// <summary>
        /// If true, this User must be granted access to perform actions or access entities on this Account.
        /// </summary>
        [Input("restricted", required: true)]
        public bool Restricted { get; set; }

        [Input("sshKeys", required: true)]
        private List<string>? _sshKeys;

        /// <summary>
        /// A list of SSH Key labels added by this User. These are the keys that will be deployed if this User is included in the authorized_users field of a create Linode, rebuild Linode, or create Disk request.
        /// </summary>
        public List<string> SshKeys
        {
            get => _sshKeys ?? (_sshKeys = new List<string>());
            set => _sshKeys = value;
        }

        [Input("stackscriptGrants", required: true)]
        private List<Inputs.GetUsersUserStackscriptGrantArgs>? _stackscriptGrants;
        public List<Inputs.GetUsersUserStackscriptGrantArgs> StackscriptGrants
        {
            get => _stackscriptGrants ?? (_stackscriptGrants = new List<Inputs.GetUsersUserStackscriptGrantArgs>());
            set => _stackscriptGrants = value;
        }

        /// <summary>
        /// A boolean value indicating if the User has Two Factor Authentication (TFA) enabled.
        /// </summary>
        [Input("tfaEnabled", required: true)]
        public bool TfaEnabled { get; set; }

        /// <summary>
        /// This User's username. This is used for logging in, and may also be displayed alongside actions the User performs (for example, in Events or public StackScripts).
        /// </summary>
        [Input("username", required: true)]
        public string Username { get; set; } = null!;

        /// <summary>
        /// The phone number verified for this User Profile with the Phone Number Verify command. null if this User Profile has no verified phone number.
        /// </summary>
        [Input("verifiedPhoneNumber", required: true)]
        public string VerifiedPhoneNumber { get; set; } = null!;

        [Input("volumeGrants", required: true)]
        private List<Inputs.GetUsersUserVolumeGrantArgs>? _volumeGrants;
        public List<Inputs.GetUsersUserVolumeGrantArgs> VolumeGrants
        {
            get => _volumeGrants ?? (_volumeGrants = new List<Inputs.GetUsersUserVolumeGrantArgs>());
            set => _volumeGrants = value;
        }

        public GetUsersUserArgs()
        {
        }
        public static new GetUsersUserArgs Empty => new GetUsersUserArgs();
    }
}
