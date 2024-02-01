// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class InstanceMetadataGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The base64-encoded user-defined data exposed to this instance through the Linode Metadata service. Refer to the base64encode(...) function for information on encoding content for this field.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        public InstanceMetadataGetArgs()
        {
        }
        public static new InstanceMetadataGetArgs Empty => new InstanceMetadataGetArgs();
    }
}
