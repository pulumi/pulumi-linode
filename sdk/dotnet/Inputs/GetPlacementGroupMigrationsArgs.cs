// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetPlacementGroupMigrationsInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("inbounds", required: true)]
        private InputList<Inputs.GetPlacementGroupMigrationsInboundInputArgs>? _inbounds;

        /// <summary>
        /// A list of the Linodes the system is migrating into the placement group.
        /// </summary>
        public InputList<Inputs.GetPlacementGroupMigrationsInboundInputArgs> Inbounds
        {
            get => _inbounds ?? (_inbounds = new InputList<Inputs.GetPlacementGroupMigrationsInboundInputArgs>());
            set => _inbounds = value;
        }

        [Input("outbounds", required: true)]
        private InputList<Inputs.GetPlacementGroupMigrationsOutboundInputArgs>? _outbounds;

        /// <summary>
        /// A list of the Linodes the system is migrating out of the placement group.
        /// </summary>
        public InputList<Inputs.GetPlacementGroupMigrationsOutboundInputArgs> Outbounds
        {
            get => _outbounds ?? (_outbounds = new InputList<Inputs.GetPlacementGroupMigrationsOutboundInputArgs>());
            set => _outbounds = value;
        }

        public GetPlacementGroupMigrationsInputArgs()
        {
        }
        public static new GetPlacementGroupMigrationsInputArgs Empty => new GetPlacementGroupMigrationsInputArgs();
    }
}
