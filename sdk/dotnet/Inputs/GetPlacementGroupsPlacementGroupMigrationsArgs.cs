// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetPlacementGroupsPlacementGroupMigrationsInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("inbounds", required: true)]
        private InputList<Inputs.GetPlacementGroupsPlacementGroupMigrationsInboundInputArgs>? _inbounds;

        /// <summary>
        /// A list of the Linodes the system is migrating into the placement group.
        /// </summary>
        public InputList<Inputs.GetPlacementGroupsPlacementGroupMigrationsInboundInputArgs> Inbounds
        {
            get => _inbounds ?? (_inbounds = new InputList<Inputs.GetPlacementGroupsPlacementGroupMigrationsInboundInputArgs>());
            set => _inbounds = value;
        }

        [Input("outbounds", required: true)]
        private InputList<Inputs.GetPlacementGroupsPlacementGroupMigrationsOutboundInputArgs>? _outbounds;

        /// <summary>
        /// A list of the Linodes the system is migrating out of the placement group.
        /// </summary>
        public InputList<Inputs.GetPlacementGroupsPlacementGroupMigrationsOutboundInputArgs> Outbounds
        {
            get => _outbounds ?? (_outbounds = new InputList<Inputs.GetPlacementGroupsPlacementGroupMigrationsOutboundInputArgs>());
            set => _outbounds = value;
        }

        public GetPlacementGroupsPlacementGroupMigrationsInputArgs()
        {
        }
        public static new GetPlacementGroupsPlacementGroupMigrationsInputArgs Empty => new GetPlacementGroupsPlacementGroupMigrationsInputArgs();
    }
}
