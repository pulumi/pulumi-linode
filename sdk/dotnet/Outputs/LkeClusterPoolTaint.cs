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
    public sealed class LkeClusterPoolTaint
    {
        /// <summary>
        /// The Kubernetes taint effect. Accepted values are `NoSchedule`, `PreferNoSchedule`, and `NoExecute`. For the descriptions of these values, see [Kubernetes Taints and Tolerations](https://kubernetes.io/docs/concepts/scheduling-eviction/taint-and-toleration/).
        /// </summary>
        public readonly string Effect;
        /// <summary>
        /// The Kubernetes taint key.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// The Kubernetes taint value.
        /// 
        /// * `autoscaler` - (Optional) If defined, an autoscaler will be enabled with the given configuration.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private LkeClusterPoolTaint(
            string effect,

            string key,

            string value)
        {
            Effect = effect;
            Key = key;
            Value = value;
        }
    }
}
