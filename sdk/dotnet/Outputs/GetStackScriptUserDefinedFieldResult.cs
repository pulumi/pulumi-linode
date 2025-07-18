// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Outputs
{

    [OutputType]
    public sealed class GetStackScriptUserDefinedFieldResult
    {
        /// <summary>
        /// The default value. If not specified, this value will be used.
        /// </summary>
        public readonly string Default;
        /// <summary>
        /// An example value for the field.
        /// </summary>
        public readonly string Example;
        /// <summary>
        /// A human-readable label for the field that will serve as the input prompt for entering the value during deployment.
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// A list of acceptable values for the field in any quantity, combination or order.
        /// </summary>
        public readonly string ManyOf;
        /// <summary>
        /// The name of the field.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A list of acceptable single values for the field.
        /// </summary>
        public readonly string OneOf;

        [OutputConstructor]
        private GetStackScriptUserDefinedFieldResult(
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
