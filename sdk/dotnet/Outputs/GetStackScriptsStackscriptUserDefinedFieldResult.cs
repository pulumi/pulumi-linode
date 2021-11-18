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
    public sealed class GetStackScriptsStackscriptUserDefinedFieldResult
    {
        public readonly string Default;
        public readonly string Example;
        public readonly string Label;
        public readonly string ManyOf;
        /// <summary>
        /// The name of the field to filter by. See the Filterable Fields section for a complete list of filterable fields.
        /// </summary>
        public readonly string Name;
        public readonly string OneOf;

        [OutputConstructor]
        private GetStackScriptsStackscriptUserDefinedFieldResult(
            string @default,

            string example,

            string label,

            string manyOf,

            string name,

            string oneOf)
        {
            Default = @default;
            Example = example;
            Label = label;
            ManyOf = manyOf;
            Name = name;
            OneOf = oneOf;
        }
    }
}
