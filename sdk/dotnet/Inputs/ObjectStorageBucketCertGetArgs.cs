// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class ObjectStorageBucketCertGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Base64 encoded and PEM formatted SSL certificate.
        /// </summary>
        [Input("certificate", required: true)]
        public Input<string> Certificate { get; set; } = null!;

        /// <summary>
        /// The private key associated with the TLS/SSL certificate.
        /// </summary>
        [Input("privateKey", required: true)]
        public Input<string> PrivateKey { get; set; } = null!;

        public ObjectStorageBucketCertGetArgs()
        {
        }
    }
}
