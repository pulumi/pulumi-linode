// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetUsers
    {
        /// <summary>
        /// Provides information about Linode users that match a set of filters.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-users).
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var filtered_users = Linode.GetUsers.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetUsersFilterInputArgs
        ///             {
        ///                 Name = "username",
        ///                 Values = new[]
        ///                 {
        ///                     "test-user",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["users"] = filtered_users.Apply(filtered_users =&gt; filtered_users.Apply(getUsersResult =&gt; getUsersResult.Users)),
        ///     };
        /// });
        /// ```
        /// 
        /// ## Filterable Fields
        /// 
        /// * `username`
        /// 
        /// * `email`
        /// 
        /// * `restricted`
        /// 
        /// * `user_type`
        /// 
        /// * `password_created`
        /// 
        /// * `tfa_enabled`
        /// 
        /// * `verfied_phone_number`
        /// </summary>
        public static Task<GetUsersResult> InvokeAsync(GetUsersArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetUsersResult>("linode:index/getUsers:getUsers", args ?? new GetUsersArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about Linode users that match a set of filters.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-users).
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var filtered_users = Linode.GetUsers.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetUsersFilterInputArgs
        ///             {
        ///                 Name = "username",
        ///                 Values = new[]
        ///                 {
        ///                     "test-user",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["users"] = filtered_users.Apply(filtered_users =&gt; filtered_users.Apply(getUsersResult =&gt; getUsersResult.Users)),
        ///     };
        /// });
        /// ```
        /// 
        /// ## Filterable Fields
        /// 
        /// * `username`
        /// 
        /// * `email`
        /// 
        /// * `restricted`
        /// 
        /// * `user_type`
        /// 
        /// * `password_created`
        /// 
        /// * `tfa_enabled`
        /// 
        /// * `verfied_phone_number`
        /// </summary>
        public static Output<GetUsersResult> Invoke(GetUsersInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetUsersResult>("linode:index/getUsers:getUsers", args ?? new GetUsersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetUsersArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetUsersFilterArgs>? _filters;
        public List<Inputs.GetUsersFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetUsersFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The order in which results should be returned. (`asc`, `desc`; default `asc`)
        /// </summary>
        [Input("order")]
        public string? Order { get; set; }

        /// <summary>
        /// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
        /// </summary>
        [Input("orderBy")]
        public string? OrderBy { get; set; }

        [Input("users")]
        private List<Inputs.GetUsersUserArgs>? _users;
        public List<Inputs.GetUsersUserArgs> Users
        {
            get => _users ?? (_users = new List<Inputs.GetUsersUserArgs>());
            set => _users = value;
        }

        public GetUsersArgs()
        {
        }
        public static new GetUsersArgs Empty => new GetUsersArgs();
    }

    public sealed class GetUsersInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetUsersFilterInputArgs>? _filters;
        public InputList<Inputs.GetUsersFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetUsersFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The order in which results should be returned. (`asc`, `desc`; default `asc`)
        /// </summary>
        [Input("order")]
        public Input<string>? Order { get; set; }

        /// <summary>
        /// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
        /// </summary>
        [Input("orderBy")]
        public Input<string>? OrderBy { get; set; }

        [Input("users")]
        private InputList<Inputs.GetUsersUserInputArgs>? _users;
        public InputList<Inputs.GetUsersUserInputArgs> Users
        {
            get => _users ?? (_users = new InputList<Inputs.GetUsersUserInputArgs>());
            set => _users = value;
        }

        public GetUsersInvokeArgs()
        {
        }
        public static new GetUsersInvokeArgs Empty => new GetUsersInvokeArgs();
    }


    [OutputType]
    public sealed class GetUsersResult
    {
        public readonly ImmutableArray<Outputs.GetUsersFilterResult> Filters;
        /// <summary>
        /// The ID of entity this grant applies to.
        /// </summary>
        public readonly string Id;
        public readonly string? Order;
        public readonly string? OrderBy;
        public readonly ImmutableArray<Outputs.GetUsersUserResult> Users;

        [OutputConstructor]
        private GetUsersResult(
            ImmutableArray<Outputs.GetUsersFilterResult> filters,

            string id,

            string? order,

            string? orderBy,

            ImmutableArray<Outputs.GetUsersUserResult> users)
        {
            Filters = filters;
            Id = id;
            Order = order;
            OrderBy = orderBy;
            Users = users;
        }
    }
}
