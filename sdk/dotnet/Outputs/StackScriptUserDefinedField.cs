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
    public sealed class StackScriptUserDefinedField
    {
        public readonly string? Default;
        public readonly string? Example;
        /// <summary>
        /// The StackScript's label is for display purposes only.
        /// </summary>
        public readonly string? Label;
        public readonly string? ManyOf;
        public readonly string? Name;
        public readonly string? OneOf;

        [OutputConstructor]
        private StackScriptUserDefinedField(
            string? @default,

            string? example,

            string? label,

            string? manyOf,

            string? name,

            string? oneOf)
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
