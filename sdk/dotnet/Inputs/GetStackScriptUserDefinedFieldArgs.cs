// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetStackScriptUserDefinedFieldInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The default value. If not specified, this value will be used.
        /// </summary>
        [Input("default", required: true)]
        public Input<string> Default { get; set; } = null!;

        /// <summary>
        /// An example value for the field.
        /// </summary>
        [Input("example", required: true)]
        public Input<string> Example { get; set; } = null!;

        /// <summary>
        /// A human-readable label for the field that will serve as the input prompt for entering the value during deployment.
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        /// <summary>
        /// A list of acceptable values for the field in any quantity, combination or order.
        /// </summary>
        [Input("manyOf", required: true)]
        public Input<string> ManyOf { get; set; } = null!;

        /// <summary>
        /// The name of the field.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// A list of acceptable single values for the field.
        /// </summary>
        [Input("oneOf", required: true)]
        public Input<string> OneOf { get; set; } = null!;

        public GetStackScriptUserDefinedFieldInputArgs()
        {
        }
        public static new GetStackScriptUserDefinedFieldInputArgs Empty => new GetStackScriptUserDefinedFieldInputArgs();
    }
}
