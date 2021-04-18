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
    public sealed class GetImagesImageResult
    {
        public readonly string Created;
        public readonly string CreatedBy;
        public readonly bool Deprecated;
        public readonly string Description;
        public readonly string Expiry;
        public readonly string Id;
        public readonly bool IsPublic;
        public readonly string Label;
        public readonly int Size;
        public readonly string Type;
        public readonly string Vendor;

        [OutputConstructor]
        private GetImagesImageResult(
            string created,

            string createdBy,

            bool deprecated,

            string description,

            string expiry,

            string id,

            bool isPublic,

            string label,

            int size,

            string type,

            string vendor)
        {
            Created = created;
            CreatedBy = createdBy;
            Deprecated = deprecated;
            Description = description;
            Expiry = expiry;
            Id = id;
            IsPublic = isPublic;
            Label = label;
            Size = size;
            Type = type;
            Vendor = vendor;
        }
    }
}
