# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities

__all__ = ['TokenArgs', 'Token']

@pulumi.input_type
class TokenArgs:
    def __init__(__self__, *,
                 scopes: pulumi.Input[str],
                 expiry: Optional[pulumi.Input[str]] = None,
                 label: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Token resource.
        :param pulumi.Input[str] scopes: The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the Linode CLI, require tokens with access to *. Tokens with more restrictive scopes are generally more secure. All scopes can be viewed in [the Linode API documentation](https://techdocs.akamai.com/linode-api/reference/get-started#oauth-reference).
        :param pulumi.Input[str] expiry: When this token will expire. Personal Access Tokens cannot be renewed, so after this time the token will be completely unusable and a new token will need to be generated. Tokens may be created with 'null' as their expiry and will never expire unless revoked.
        :param pulumi.Input[str] label: A label for the Token.
        """
        pulumi.set(__self__, "scopes", scopes)
        if expiry is not None:
            pulumi.set(__self__, "expiry", expiry)
        if label is not None:
            pulumi.set(__self__, "label", label)

    @property
    @pulumi.getter
    def scopes(self) -> pulumi.Input[str]:
        """
        The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the Linode CLI, require tokens with access to *. Tokens with more restrictive scopes are generally more secure. All scopes can be viewed in [the Linode API documentation](https://techdocs.akamai.com/linode-api/reference/get-started#oauth-reference).
        """
        return pulumi.get(self, "scopes")

    @scopes.setter
    def scopes(self, value: pulumi.Input[str]):
        pulumi.set(self, "scopes", value)

    @property
    @pulumi.getter
    def expiry(self) -> Optional[pulumi.Input[str]]:
        """
        When this token will expire. Personal Access Tokens cannot be renewed, so after this time the token will be completely unusable and a new token will need to be generated. Tokens may be created with 'null' as their expiry and will never expire unless revoked.
        """
        return pulumi.get(self, "expiry")

    @expiry.setter
    def expiry(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expiry", value)

    @property
    @pulumi.getter
    def label(self) -> Optional[pulumi.Input[str]]:
        """
        A label for the Token.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "label", value)


@pulumi.input_type
class _TokenState:
    def __init__(__self__, *,
                 created: Optional[pulumi.Input[str]] = None,
                 expiry: Optional[pulumi.Input[str]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 scopes: Optional[pulumi.Input[str]] = None,
                 token: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Token resources.
        :param pulumi.Input[str] created: The date this Token was created.
        :param pulumi.Input[str] expiry: When this token will expire. Personal Access Tokens cannot be renewed, so after this time the token will be completely unusable and a new token will need to be generated. Tokens may be created with 'null' as their expiry and will never expire unless revoked.
        :param pulumi.Input[str] label: A label for the Token.
        :param pulumi.Input[str] scopes: The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the Linode CLI, require tokens with access to *. Tokens with more restrictive scopes are generally more secure. All scopes can be viewed in [the Linode API documentation](https://techdocs.akamai.com/linode-api/reference/get-started#oauth-reference).
        :param pulumi.Input[str] token: The token used to access the API.
        """
        if created is not None:
            pulumi.set(__self__, "created", created)
        if expiry is not None:
            pulumi.set(__self__, "expiry", expiry)
        if label is not None:
            pulumi.set(__self__, "label", label)
        if scopes is not None:
            pulumi.set(__self__, "scopes", scopes)
        if token is not None:
            pulumi.set(__self__, "token", token)

    @property
    @pulumi.getter
    def created(self) -> Optional[pulumi.Input[str]]:
        """
        The date this Token was created.
        """
        return pulumi.get(self, "created")

    @created.setter
    def created(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created", value)

    @property
    @pulumi.getter
    def expiry(self) -> Optional[pulumi.Input[str]]:
        """
        When this token will expire. Personal Access Tokens cannot be renewed, so after this time the token will be completely unusable and a new token will need to be generated. Tokens may be created with 'null' as their expiry and will never expire unless revoked.
        """
        return pulumi.get(self, "expiry")

    @expiry.setter
    def expiry(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expiry", value)

    @property
    @pulumi.getter
    def label(self) -> Optional[pulumi.Input[str]]:
        """
        A label for the Token.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter
    def scopes(self) -> Optional[pulumi.Input[str]]:
        """
        The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the Linode CLI, require tokens with access to *. Tokens with more restrictive scopes are generally more secure. All scopes can be viewed in [the Linode API documentation](https://techdocs.akamai.com/linode-api/reference/get-started#oauth-reference).
        """
        return pulumi.get(self, "scopes")

    @scopes.setter
    def scopes(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "scopes", value)

    @property
    @pulumi.getter
    def token(self) -> Optional[pulumi.Input[str]]:
        """
        The token used to access the API.
        """
        return pulumi.get(self, "token")

    @token.setter
    def token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "token", value)


class Token(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 expiry: Optional[pulumi.Input[str]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 scopes: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Linode Token resource.  This can be used to create, modify, and delete Linode API Personal Access Tokens.  Personal Access Tokens proxy user credentials for Linode API access.  This is necessary for tools, such as Pulumi, to interact with Linode services on a user's behalf.

        It is common for the provider itself to be configured with broadly scoped Personal Access Tokens.  Provisioning scripts or tools configured within a Linode Instance should follow the principle of least privilege to afford only the required roles for tools to perform their necessary tasks.  The `Token` resource allows for the management of Personal Access Tokens with scopes mirroring or narrowing the scope of the parent token.

        For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-personal-access-tokens).

        ## Example Usage

        The following example shows how one might use this resource to configure a token for use in another tool that needs access to Linode resources.

        ```python
        import pulumi
        import pulumi_linode as linode

        foo = linode.Token("foo",
            label="token",
            scopes="linodes:read_only",
            expiry="2100-01-02T03:04:05Z")
        foo_instance = linode.Instance("foo")
        ```

        ## Import

        Linodes Tokens can be imported using the Linode Token `id`, e.g.  The secret token will not be imported.

        ```sh
        $ pulumi import linode:index/token:Token mytoken 1234567
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] expiry: When this token will expire. Personal Access Tokens cannot be renewed, so after this time the token will be completely unusable and a new token will need to be generated. Tokens may be created with 'null' as their expiry and will never expire unless revoked.
        :param pulumi.Input[str] label: A label for the Token.
        :param pulumi.Input[str] scopes: The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the Linode CLI, require tokens with access to *. Tokens with more restrictive scopes are generally more secure. All scopes can be viewed in [the Linode API documentation](https://techdocs.akamai.com/linode-api/reference/get-started#oauth-reference).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TokenArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Linode Token resource.  This can be used to create, modify, and delete Linode API Personal Access Tokens.  Personal Access Tokens proxy user credentials for Linode API access.  This is necessary for tools, such as Pulumi, to interact with Linode services on a user's behalf.

        It is common for the provider itself to be configured with broadly scoped Personal Access Tokens.  Provisioning scripts or tools configured within a Linode Instance should follow the principle of least privilege to afford only the required roles for tools to perform their necessary tasks.  The `Token` resource allows for the management of Personal Access Tokens with scopes mirroring or narrowing the scope of the parent token.

        For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-personal-access-tokens).

        ## Example Usage

        The following example shows how one might use this resource to configure a token for use in another tool that needs access to Linode resources.

        ```python
        import pulumi
        import pulumi_linode as linode

        foo = linode.Token("foo",
            label="token",
            scopes="linodes:read_only",
            expiry="2100-01-02T03:04:05Z")
        foo_instance = linode.Instance("foo")
        ```

        ## Import

        Linodes Tokens can be imported using the Linode Token `id`, e.g.  The secret token will not be imported.

        ```sh
        $ pulumi import linode:index/token:Token mytoken 1234567
        ```

        :param str resource_name: The name of the resource.
        :param TokenArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TokenArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 expiry: Optional[pulumi.Input[str]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 scopes: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TokenArgs.__new__(TokenArgs)

            __props__.__dict__["expiry"] = expiry
            __props__.__dict__["label"] = label
            if scopes is None and not opts.urn:
                raise TypeError("Missing required property 'scopes'")
            __props__.__dict__["scopes"] = scopes
            __props__.__dict__["created"] = None
            __props__.__dict__["token"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["token"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
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
        :param pulumi.Input[str] created: The date this Token was created.
        :param pulumi.Input[str] expiry: When this token will expire. Personal Access Tokens cannot be renewed, so after this time the token will be completely unusable and a new token will need to be generated. Tokens may be created with 'null' as their expiry and will never expire unless revoked.
        :param pulumi.Input[str] label: A label for the Token.
        :param pulumi.Input[str] scopes: The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the Linode CLI, require tokens with access to *. Tokens with more restrictive scopes are generally more secure. All scopes can be viewed in [the Linode API documentation](https://techdocs.akamai.com/linode-api/reference/get-started#oauth-reference).
        :param pulumi.Input[str] token: The token used to access the API.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TokenState.__new__(_TokenState)

        __props__.__dict__["created"] = created
        __props__.__dict__["expiry"] = expiry
        __props__.__dict__["label"] = label
        __props__.__dict__["scopes"] = scopes
        __props__.__dict__["token"] = token
        return Token(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def created(self) -> pulumi.Output[str]:
        """
        The date this Token was created.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def expiry(self) -> pulumi.Output[str]:
        """
        When this token will expire. Personal Access Tokens cannot be renewed, so after this time the token will be completely unusable and a new token will need to be generated. Tokens may be created with 'null' as their expiry and will never expire unless revoked.
        """
        return pulumi.get(self, "expiry")

    @property
    @pulumi.getter
    def label(self) -> pulumi.Output[Optional[str]]:
        """
        A label for the Token.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def scopes(self) -> pulumi.Output[str]:
        """
        The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the Linode CLI, require tokens with access to *. Tokens with more restrictive scopes are generally more secure. All scopes can be viewed in [the Linode API documentation](https://techdocs.akamai.com/linode-api/reference/get-started#oauth-reference).
        """
        return pulumi.get(self, "scopes")

    @property
    @pulumi.getter
    def token(self) -> pulumi.Output[str]:
        """
        The token used to access the API.
        """
        return pulumi.get(self, "token")

