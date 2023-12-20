// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetAccountAvailabilitiesAvailabilityInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The region this availability entry refers to.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        [Input("unavailables", required: true)]
        private InputList<string>? _unavailables;

        /// <summary>
        /// A set of services that are unavailable for the given region.
        /// </summary>
        public InputList<string> Unavailables
        {
            get => _unavailables ?? (_unavailables = new InputList<string>());
            set => _unavailables = value;
        }

        public GetAccountAvailabilitiesAvailabilityInputArgs()
        {
        }
        public static new GetAccountAvailabilitiesAvailabilityInputArgs Empty => new GetAccountAvailabilitiesAvailabilityInputArgs();
    }
}
