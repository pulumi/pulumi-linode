// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetChildAccountsChildAccountInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When this account was first activated
        /// </summary>
        [Input("activeSince", required: true)]
        public Input<string> ActiveSince { get; set; } = null!;

        /// <summary>
        /// First line of this Account's billing address.
        /// </summary>
        [Input("address1", required: true)]
        public Input<string> Address1 { get; set; } = null!;

        /// <summary>
        /// Second line of this Account's billing address.
        /// </summary>
        [Input("address2", required: true)]
        public Input<string> Address2 { get; set; } = null!;

        /// <summary>
        /// This Account's balance, in US dollars.
        /// </summary>
        [Input("balance", required: true)]
        public Input<double> Balance { get; set; } = null!;

        [Input("capabilities", required: true)]
        private InputList<string>? _capabilities;

        /// <summary>
        /// A set containing all the capabilities of this Account.
        /// </summary>
        public InputList<string> Capabilities
        {
            get => _capabilities ?? (_capabilities = new InputList<string>());
            set => _capabilities = value;
        }

        /// <summary>
        /// The city for this Account's billing address.
        /// </summary>
        [Input("city", required: true)]
        public Input<string> City { get; set; } = null!;

        /// <summary>
        /// The company name associated with this Account.
        /// </summary>
        [Input("company", required: true)]
        public Input<string> Company { get; set; } = null!;

        /// <summary>
        /// The two-letter country code of this Account's billing address.
        /// </summary>
        [Input("country", required: true)]
        public Input<string> Country { get; set; } = null!;

        /// <summary>
        /// The email address for this Account, for account management communications, and may be used for other communications as configured.
        /// </summary>
        [Input("email", required: true)]
        public Input<string> Email { get; set; } = null!;

        /// <summary>
        /// The unique ID of this Account.
        /// </summary>
        [Input("euuid", required: true)]
        public Input<string> Euuid { get; set; } = null!;

        /// <summary>
        /// The first name of the person associated with this Account.
        /// </summary>
        [Input("firstName", required: true)]
        public Input<string> FirstName { get; set; } = null!;

        /// <summary>
        /// The Email of the Account.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// The last name of the person associated with this Account.
        /// </summary>
        [Input("lastName", required: true)]
        public Input<string> LastName { get; set; } = null!;

        /// <summary>
        /// The phone number associated with this Account.
        /// </summary>
        [Input("phone", required: true)]
        public Input<string> Phone { get; set; } = null!;

        /// <summary>
        /// If billing address is in the United States, this is the State portion of the Account's billing address. If the address is outside the US, this is the Province associated with the Account's billing address.
        /// </summary>
        [Input("state", required: true)]
        public Input<string> State { get; set; } = null!;

        /// <summary>
        /// The zip code of this Account's billing address.
        /// </summary>
        [Input("zip", required: true)]
        public Input<string> Zip { get; set; } = null!;

        public GetChildAccountsChildAccountInputArgs()
        {
        }
        public static new GetChildAccountsChildAccountInputArgs Empty => new GetChildAccountsChildAccountInputArgs();
    }
}
