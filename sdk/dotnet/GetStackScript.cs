// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetStackScript
    {
        /// <summary>
        /// Provides details about a specific Linode StackScript.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// The following example shows how one might use this data source to access information about a Linode StackScript.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myStackscript = Linode.GetStackScript.Invoke(new()
        ///     {
        ///         Id = 355872,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetStackScriptResult> InvokeAsync(GetStackScriptArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetStackScriptResult>("linode:index/getStackScript:getStackScript", args ?? new GetStackScriptArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about a specific Linode StackScript.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// The following example shows how one might use this data source to access information about a Linode StackScript.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myStackscript = Linode.GetStackScript.Invoke(new()
        ///     {
        ///         Id = 355872,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetStackScriptResult> Invoke(GetStackScriptInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetStackScriptResult>("linode:index/getStackScript:getStackScript", args ?? new GetStackScriptInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetStackScriptArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique numeric ID of the StackScript to query.
        /// </summary>
        [Input("id", required: true)]
        public int Id { get; set; }

        [Input("userDefinedFields")]
        private List<Inputs.GetStackScriptUserDefinedFieldArgs>? _userDefinedFields;

        /// <summary>
        /// This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
        /// </summary>
        public List<Inputs.GetStackScriptUserDefinedFieldArgs> UserDefinedFields
        {
            get => _userDefinedFields ?? (_userDefinedFields = new List<Inputs.GetStackScriptUserDefinedFieldArgs>());
            set => _userDefinedFields = value;
        }

        public GetStackScriptArgs()
        {
        }
        public static new GetStackScriptArgs Empty => new GetStackScriptArgs();
    }

    public sealed class GetStackScriptInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique numeric ID of the StackScript to query.
        /// </summary>
        [Input("id", required: true)]
        public Input<int> Id { get; set; } = null!;

        [Input("userDefinedFields")]
        private InputList<Inputs.GetStackScriptUserDefinedFieldInputArgs>? _userDefinedFields;

        /// <summary>
        /// This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
        /// </summary>
        public InputList<Inputs.GetStackScriptUserDefinedFieldInputArgs> UserDefinedFields
        {
            get => _userDefinedFields ?? (_userDefinedFields = new InputList<Inputs.GetStackScriptUserDefinedFieldInputArgs>());
            set => _userDefinedFields = value;
        }

        public GetStackScriptInvokeArgs()
        {
        }
        public static new GetStackScriptInvokeArgs Empty => new GetStackScriptInvokeArgs();
    }


    [OutputType]
    public sealed class GetStackScriptResult
    {
        /// <summary>
        /// The date this StackScript was created.
        /// </summary>
        public readonly string Created;
        /// <summary>
        /// Count of currently active, deployed Linodes created from this StackScript.
        /// </summary>
        public readonly int DeploymentsActive;
        /// <summary>
        /// The total number of times this StackScript has been deployed.
        /// </summary>
        public readonly int DeploymentsTotal;
        /// <summary>
        /// A description for the StackScript.
        /// </summary>
        public readonly string Description;
        public readonly int Id;
        /// <summary>
        /// An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
        /// </summary>
        public readonly ImmutableArray<string> Images;
        /// <summary>
        /// This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private.
        /// </summary>
        public readonly bool IsPublic;
        /// <summary>
        /// A human-readable label for the field that will serve as the input prompt for entering the value during deployment.
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// This field allows you to add notes for the set of revisions made to this StackScript.
        /// </summary>
        public readonly string RevNote;
        /// <summary>
        /// The script to execute when provisioning a new Linode with this StackScript.
        /// </summary>
        public readonly string Script;
        /// <summary>
        /// The date this StackScript was updated.
        /// </summary>
        public readonly string Updated;
        /// <summary>
        /// This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetStackScriptUserDefinedFieldResult> UserDefinedFields;
        /// <summary>
        /// The Gravatar ID for the User who created the StackScript.
        /// </summary>
        public readonly string UserGravatarId;
        /// <summary>
        /// The User who created the StackScript.
        /// </summary>
        public readonly string Username;

        [OutputConstructor]
        private GetStackScriptResult(
            string created,

            int deploymentsActive,

            int deploymentsTotal,

            string description,

            int id,

            ImmutableArray<string> images,

            bool isPublic,

            string label,

            string revNote,

            string script,

            string updated,

            ImmutableArray<Outputs.GetStackScriptUserDefinedFieldResult> userDefinedFields,

            string userGravatarId,

            string username)
        {
            Created = created;
            DeploymentsActive = deploymentsActive;
            DeploymentsTotal = deploymentsTotal;
            Description = description;
            Id = id;
            Images = images;
            IsPublic = isPublic;
            Label = label;
            RevNote = revNote;
            Script = script;
            Updated = updated;
            UserDefinedFields = userDefinedFields;
            UserGravatarId = userGravatarId;
            Username = username;
        }
    }
}
