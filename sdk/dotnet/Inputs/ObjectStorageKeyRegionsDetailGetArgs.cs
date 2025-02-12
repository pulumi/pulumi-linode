// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class ObjectStorageKeyRegionsDetailGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of `s3_endpoint` available to the user in this region. See [Endpoint types](https://techdocs.akamai.com/cloud-computing/docs/object-storage#endpoint-type) for more information.
        /// </summary>
        [Input("endpointType", required: true)]
        public Input<string> EndpointType { get; set; } = null!;

        /// <summary>
        /// The ID of the region.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// The S3-compatible hostname you can use to access the Object Storage buckets in this region.
        /// </summary>
        [Input("s3Endpoint", required: true)]
        public Input<string> S3Endpoint { get; set; } = null!;

        public ObjectStorageKeyRegionsDetailGetArgs()
        {
        }
        public static new ObjectStorageKeyRegionsDetailGetArgs Empty => new ObjectStorageKeyRegionsDetailGetArgs();
    }
}
