// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetInstancesFilterArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The method to match the field by. (`exact`, `regex`, `substring`; default `exact`)
        /// </summary>
        [Input("matchBy")]
        public string? MatchBy { get; set; }

        /// <summary>
        /// The name of the field to filter by. See the Filterable Fields section for a list of filterable fields.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("values", required: true)]
        private List<string>? _values;

        /// <summary>
        /// A list of values for the filter to allow. These values should all be in string form.
        /// </summary>
        public List<string> Values
        {
            get => _values ?? (_values = new List<string>());
            set => _values = value;
        }

        public GetInstancesFilterArgs()
        {
        }
    }
}
