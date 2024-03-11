// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetAccount
    {
        /// <summary>
        /// Provides information about a Linode account.
        /// 
        /// This data source should not be used in conjuction with the `LINODE_DEBUG` option.  See the [debugging notes](https://www.terraform.io/providers/linode/linode/latest/docs#debugging) for more details.
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access account details.
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var account = Linode.GetAccount.Invoke();
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetAccountResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAccountResult>("linode:index/getAccount:getAccount", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Provides information about a Linode account.
        /// 
        /// This data source should not be used in conjuction with the `LINODE_DEBUG` option.  See the [debugging notes](https://www.terraform.io/providers/linode/linode/latest/docs#debugging) for more details.
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access account details.
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var account = Linode.GetAccount.Invoke();
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetAccountResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccountResult>("linode:index/getAccount:getAccount", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetAccountResult
    {
        /// <summary>
        /// First line of this Account's billing address.
        /// </summary>
        public readonly string Address1;
        /// <summary>
        /// Second line of this Account's billing address.
        /// </summary>
        public readonly string Address2;
        /// <summary>
        /// This Account's balance, in US dollars.
        /// </summary>
        public readonly double Balance;
        /// <summary>
        /// The city for this Account's billing address.
        /// </summary>
        public readonly string City;
        /// <summary>
        /// The company name associated with this Account.
        /// </summary>
        public readonly string Company;
        /// <summary>
        /// The two-letter country code of this Account's billing address.
        /// </summary>
        public readonly string Country;
        /// <summary>
        /// The email address for this Account, for account management communications, and may be used for other communications as configured.
        /// </summary>
        public readonly string Email;
        /// <summary>
        /// The first name of the person associated with this Account.
        /// </summary>
        public readonly string FirstName;
        public readonly string Id;
        /// <summary>
        /// The last name of the person associated with this Account.
        /// </summary>
        public readonly string LastName;
        /// <summary>
        /// The phone number associated with this Account.
        /// </summary>
        public readonly string Phone;
        /// <summary>
        /// If billing address is in the United States, this is the State portion of the Account's billing address. If the address is outside the US, this is the Province associated with the Account's billing address.
        /// </summary>
        public readonly string State;
        /// <summary>
        /// The zip code of this Account's billing address.
        /// </summary>
        public readonly string Zip;

        [OutputConstructor]
        private GetAccountResult(
            string address1,

            string address2,

            double balance,

            string city,

            string company,

            string country,

            string email,

            string firstName,

            string id,

            string lastName,

            string phone,

            string state,

            string zip)
        {
            Address1 = address1;
            Address2 = address2;
            Balance = balance;
            City = city;
            Company = company;
            Country = country;
            Email = email;
            FirstName = firstName;
            Id = id;
            LastName = lastName;
            Phone = phone;
            State = state;
            Zip = zip;
        }
    }
}
