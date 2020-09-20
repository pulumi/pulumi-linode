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
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// The following example shows how one might use this data source to access account details.
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var account = Output.Create(Linode.GetAccount.InvokeAsync());
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Attributes
        /// 
        /// The Linode Account resource exports the following attributes:
        /// 
        /// * `email` - The email address for this Account, for account management communications, and may be used for other communications as configured.
        /// 
        /// * `first_name` - The first name of the person associated with this Account.
        /// 
        /// * `last_name` - The last name of the person associated with this Account.
        /// 
        /// * `company` - The company name associated with this Account.
        /// 
        /// * `address_1` - First line of this Account's billing address.
        /// 
        /// * `address_2` - Second line of this Account's billing address.
        /// 
        /// * `phone` - The phone number associated with this Account.
        /// 
        /// * `city` - The city for this Account's billing address.
        /// 
        /// * `state` - If billing address is in the United States, this is the State portion of the Account's billing address. If the address is outside the US, this is the Province associated with the Account's billing address.
        /// 
        /// * `country` - The two-letter country code of this Account's billing address.
        /// 
        /// * `zip` - The zip code of this Account's billing address.
        /// 
        /// * `balance` - This Account's balance, in US dollars.
        /// </summary>
        public static Task<GetAccountResult> InvokeAsync(InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAccountResult>("linode:index/getAccount:getAccount", InvokeArgs.Empty, options.WithVersion());
    }


    [OutputType]
    public sealed class GetAccountResult
    {
        public readonly string Address1;
        public readonly string Address2;
        public readonly int Balance;
        public readonly string City;
        public readonly string Company;
        public readonly string Country;
        public readonly string Email;
        public readonly string FirstName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string LastName;
        public readonly string Phone;
        public readonly string State;
        public readonly string Zip;

        [OutputConstructor]
        private GetAccountResult(
            string address1,

            string address2,

            int balance,

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
