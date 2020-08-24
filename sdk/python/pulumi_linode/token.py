# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables

__all__ = ['Token']


class Token(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 expiry: Optional[pulumi.Input[str]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 scopes: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Linode Token resource.  This can be used to create, modify, and delete Linode API Personal Access Tokens.  Personal Access Tokens proxy user credentials for Linode API access.  This is necessary for tools, to interact with Linode services on a user's behalf.

        It is common for the provider itself to be configured with broadly scoped Personal Access Tokens.  Provisioning scripts or tools configured within a Linode Instance should follow the principle of least privilege to afford only the required roles for tools to perform their necessary tasks.  The `Token` resource allows for the management of Personal Access Tokens with scopes mirroring or narrowing the scope of the parent token.

        For more information, see the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/getTokens).

        ## Example Usage

        The following example shows how one might use this resource to configure a token for use in another tool that needs access to Linode resources.

        ```python
        import pulumi
        import pulumi_linode as linode

        foo_token = linode.Token("fooToken",
            expiry="2100-01-02T03:04:05Z",
            label="token",
            scopes="linodes:read_only")
        foo_instance = linode.Instance("fooInstance")
        ```
        ## Attributes

        This resource exports the following attributes:

        * `token` - The token used to access the API.

        * `created` - The date this Token was created.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] expiry: When this token will expire. Personal Access Tokens cannot be renewed, so after this time the token will be completely unusable and a new token will need to be generated. Tokens may be created with 'null' as their expiry and will never expire unless revoked.
        :param pulumi.Input[str] label: A label for the Token.
        :param pulumi.Input[str] scopes: The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the Linode CLI, require tokens with access to *. Tokens with more restrictive scopes are generally more secure.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['expiry'] = expiry
            __props__['label'] = label
            if scopes is None:
                raise TypeError("Missing required property 'scopes'")
            __props__['scopes'] = scopes
            __props__['created'] = None
            __props__['token'] = None
        super(Token, __self__).__init__(
            'linode:index/token:Token',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created: Optional[pulumi.Input[str]] = None,
            expiry: Optional[pulumi.Input[str]] = None,
            label: Optional[pulumi.Input[str]] = None,
            scopes: Optional[pulumi.Input[str]] = None,
            token: Optional[pulumi.Input[str]] = None) -> 'Token':
        """
        Get an existing Token resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created: The date and time this token was created.
        :param pulumi.Input[str] expiry: When this token will expire. Personal Access Tokens cannot be renewed, so after this time the token will be completely unusable and a new token will need to be generated. Tokens may be created with 'null' as their expiry and will never expire unless revoked.
        :param pulumi.Input[str] label: A label for the Token.
        :param pulumi.Input[str] scopes: The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the Linode CLI, require tokens with access to *. Tokens with more restrictive scopes are generally more secure.
        :param pulumi.Input[str] token: The token used to access the API.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["created"] = created
        __props__["expiry"] = expiry
        __props__["label"] = label
        __props__["scopes"] = scopes
        __props__["token"] = token
        return Token(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def created(self) -> str:
        """
        The date and time this token was created.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def expiry(self) -> Optional[str]:
        """
        When this token will expire. Personal Access Tokens cannot be renewed, so after this time the token will be completely unusable and a new token will need to be generated. Tokens may be created with 'null' as their expiry and will never expire unless revoked.
        """
        return pulumi.get(self, "expiry")

    @property
    @pulumi.getter
    def label(self) -> Optional[str]:
        """
        A label for the Token.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def scopes(self) -> str:
        """
        The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the Linode CLI, require tokens with access to *. Tokens with more restrictive scopes are generally more secure.
        """
        return pulumi.get(self, "scopes")

    @property
    @pulumi.getter
    def token(self) -> str:
        """
        The token used to access the API.
        """
        return pulumi.get(self, "token")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

