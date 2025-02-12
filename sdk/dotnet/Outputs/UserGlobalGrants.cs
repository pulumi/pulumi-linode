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
    public sealed class UserGlobalGrants
    {
        /// <summary>
        /// The level of access this User has to Account-level actions, like billing information. A restricted User will never be able to manage users.
        /// </summary>
        public readonly string? AccountAccess;
        /// <summary>
        /// If true, this User may add Databases.
        /// </summary>
        public readonly bool? AddDatabases;
        /// <summary>
        /// If true, this User may add Domains.
        /// </summary>
        public readonly bool? AddDomains;
        /// <summary>
        /// If true, this User may add Firewalls.
        /// </summary>
        public readonly bool? AddFirewalls;
        /// <summary>
        /// If true, this User may add Images.
        /// </summary>
        public readonly bool? AddImages;
        /// <summary>
        /// If true, this User may create Linodes.
        /// </summary>
        public readonly bool? AddLinodes;
        /// <summary>
        /// If true, this User may create Longview clients and view the current plan.
        /// </summary>
        public readonly bool? AddLongview;
        /// <summary>
        /// If true, this User may add NodeBalancers.
        /// </summary>
        public readonly bool? AddNodebalancers;
        /// <summary>
        /// If true, this User may add Placement Groups.
        /// </summary>
        public readonly bool? AddPlacementGroups;
        /// <summary>
        /// If true, this User may add StackScripts.
        /// </summary>
        public readonly bool? AddStackscripts;
        /// <summary>
        /// If true, this User may add Volumes.
        /// </summary>
        public readonly bool? AddVolumes;
        /// <summary>
        /// If true, this User may add Virtual Private Clouds (VPCs).
        /// </summary>
        public readonly bool? AddVpcs;
        /// <summary>
        /// If true, this User may cancel the entire Account.
        /// </summary>
        public readonly bool? CancelAccount;
        /// <summary>
        /// If true, this User may manage the Account’s Longview subscription.
        /// </summary>
        public readonly bool? LongviewSubscription;

        [OutputConstructor]
        private UserGlobalGrants(
            string? accountAccess,

            bool? addDatabases,

            bool? addDomains,

            bool? addFirewalls,

            bool? addImages,

            bool? addLinodes,

            bool? addLongview,

            bool? addNodebalancers,

            bool? addPlacementGroups,

            bool? addStackscripts,

            bool? addVolumes,

            bool? addVpcs,

            bool? cancelAccount,

            bool? longviewSubscription)
        {
            AccountAccess = accountAccess;
            AddDatabases = addDatabases;
            AddDomains = addDomains;
            AddFirewalls = addFirewalls;
            AddImages = addImages;
            AddLinodes = addLinodes;
            AddLongview = addLongview;
            AddNodebalancers = addNodebalancers;
            AddPlacementGroups = addPlacementGroups;
            AddStackscripts = addStackscripts;
            AddVolumes = addVolumes;
            AddVpcs = addVpcs;
            CancelAccount = cancelAccount;
            LongviewSubscription = longviewSubscription;
        }
    }
}
