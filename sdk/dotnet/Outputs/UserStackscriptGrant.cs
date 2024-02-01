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
    public sealed class UserStackscriptGrant
    {
        /// <summary>
        /// The ID of the entity this grant applies to.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// The level of access this User has to this entity. If null, this User has no access.
        /// </summary>
        public readonly string Permissions;

        [OutputConstructor]
        private UserStackscriptGrant(
            int id,

            string permissions)
        {
            Id = id;
            Permissions = permissions;
        }
    }
}
