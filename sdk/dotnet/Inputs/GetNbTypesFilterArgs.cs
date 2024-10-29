// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetNbTypesFilterInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of comparison to use for this filter.
        /// </summary>
        [Input("matchBy")]
        public Input<string>? MatchBy { get; set; }

        /// <summary>
        /// The name of the attribute to filter on.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("values", required: true)]
        private InputList<string>? _values;

        /// <summary>
        /// The value(s) to be used in the filter.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public GetNbTypesFilterInputArgs()
        {
        }
        public static new GetNbTypesFilterInputArgs Empty => new GetNbTypesFilterInputArgs();
    }
}
