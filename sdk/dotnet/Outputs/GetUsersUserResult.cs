// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Outputs
{

    [OutputType]
    public sealed class GetUsersUserResult
    {
        /// <summary>
        /// A set containing all of the user's active grants.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetUsersUserDatabaseGrantResult> DatabaseGrants;
        /// <summary>
        /// A set containing all of the user's active grants.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetUsersUserDomainGrantResult> DomainGrants;
        /// <summary>
        /// The email address for this User, for account management communications, and may be used for other communications as configured.
        /// </summary>
        public readonly string Email;
        /// <summary>
        /// A set containing all of the user's active grants.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetUsersUserFirewallGrantResult> FirewallGrants;
        /// <summary>
        /// A structure containing the Account-level grants a User has.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetUsersUserGlobalGrantResult> GlobalGrants;
        /// <summary>
        /// The ID of entity this grant applies to.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A set containing all of the user's active grants.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetUsersUserImageGrantResult> ImageGrants;
        /// <summary>
        /// A set containing all of the user's active grants.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetUsersUserLinodeGrantResult> LinodeGrants;
        /// <summary>
        /// A set containing all of the user's active grants.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetUsersUserLongviewGrantResult> LongviewGrants;
        /// <summary>
        /// A set containing all of the user's active grants.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetUsersUserNodebalancerGrantResult> NodebalancerGrants;
        /// <summary>
        /// The date and time when this User’s current password was created. User passwords are first created during the Account sign-up process, and updated using the Reset Password webpage. null if this User has not created a password yet.
        /// </summary>
        public readonly string PasswordCreated;
        /// <summary>
        /// A set containing all of the user's active grants.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetUsersUserPlacementGroupGrantResult> PlacementGroupGrants;
        /// <summary>
        /// If true, this User must be granted access to perform actions or access entities on this Account.
        /// </summary>
        public readonly bool Restricted;
        /// <summary>
        /// A list of SSH Key labels added by this User. These are the keys that will be deployed if this User is included in the authorized_users field of a create Linode, rebuild Linode, or create Disk request.
        /// </summary>
        public readonly ImmutableArray<string> SshKeys;
        /// <summary>
        /// A set containing all of the user's active grants.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetUsersUserStackscriptGrantResult> StackscriptGrants;
        /// <summary>
        /// A boolean value indicating if the User has Two Factor Authentication (TFA) enabled.
        /// </summary>
        public readonly bool TfaEnabled;
        /// <summary>
        /// The type of this user.
        /// </summary>
        public readonly string UserType;
        /// <summary>
        /// This User's username. This is used for logging in, and may also be displayed alongside actions the User performs (for example, in Events or public StackScripts).
        /// </summary>
        public readonly string Username;
        /// <summary>
        /// The phone number verified for this User Profile with the Phone Number Verify command. null if this User Profile has no verified phone number.
        /// </summary>
        public readonly string VerifiedPhoneNumber;
        /// <summary>
        /// A set containing all of the user's active grants.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetUsersUserVolumeGrantResult> VolumeGrants;
        /// <summary>
        /// A set containing all of the user's active grants.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetUsersUserVpcGrantResult> VpcGrants;

        [OutputConstructor]
        private GetUsersUserResult(
            ImmutableArray<Outputs.GetUsersUserDatabaseGrantResult> databaseGrants,

            ImmutableArray<Outputs.GetUsersUserDomainGrantResult> domainGrants,

            string email,

            ImmutableArray<Outputs.GetUsersUserFirewallGrantResult> firewallGrants,

            ImmutableArray<Outputs.GetUsersUserGlobalGrantResult> globalGrants,

            string id,

            ImmutableArray<Outputs.GetUsersUserImageGrantResult> imageGrants,

            ImmutableArray<Outputs.GetUsersUserLinodeGrantResult> linodeGrants,

            ImmutableArray<Outputs.GetUsersUserLongviewGrantResult> longviewGrants,

            ImmutableArray<Outputs.GetUsersUserNodebalancerGrantResult> nodebalancerGrants,

            string passwordCreated,

            ImmutableArray<Outputs.GetUsersUserPlacementGroupGrantResult> placementGroupGrants,

            bool restricted,

            ImmutableArray<string> sshKeys,

            ImmutableArray<Outputs.GetUsersUserStackscriptGrantResult> stackscriptGrants,

            bool tfaEnabled,

            string userType,

            string username,

            string verifiedPhoneNumber,

            ImmutableArray<Outputs.GetUsersUserVolumeGrantResult> volumeGrants,

            ImmutableArray<Outputs.GetUsersUserVpcGrantResult> vpcGrants)
        {
            DatabaseGrants = databaseGrants;
            DomainGrants = domainGrants;
            Email = email;
            FirewallGrants = firewallGrants;
            GlobalGrants = globalGrants;
            Id = id;
            ImageGrants = imageGrants;
            LinodeGrants = linodeGrants;
            LongviewGrants = longviewGrants;
            NodebalancerGrants = nodebalancerGrants;
            PasswordCreated = passwordCreated;
            PlacementGroupGrants = placementGroupGrants;
            Restricted = restricted;
            SshKeys = sshKeys;
            StackscriptGrants = stackscriptGrants;
            TfaEnabled = tfaEnabled;
            UserType = userType;
            Username = username;
            VerifiedPhoneNumber = verifiedPhoneNumber;
            VolumeGrants = volumeGrants;
            VpcGrants = vpcGrants;
        }
    }
}
