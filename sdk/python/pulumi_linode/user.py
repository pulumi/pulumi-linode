# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['UserArgs', 'User']

@pulumi.input_type
class UserArgs:
    def __init__(__self__, *,
                 email: pulumi.Input[str],
                 username: pulumi.Input[str],
                 restricted: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a User resource.
        :param pulumi.Input[str] email: The email address of the user.
        :param pulumi.Input[str] username: The username of the user.
        :param pulumi.Input[bool] restricted: If true, this user will only have explicit permissions granted.
        """
        pulumi.set(__self__, "email", email)
        pulumi.set(__self__, "username", username)
        if restricted is not None:
            pulumi.set(__self__, "restricted", restricted)

    @property
    @pulumi.getter
    def email(self) -> pulumi.Input[str]:
        """
        The email address of the user.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: pulumi.Input[str]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter
    def username(self) -> pulumi.Input[str]:
        """
        The username of the user.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: pulumi.Input[str]):
        pulumi.set(self, "username", value)

    @property
    @pulumi.getter
    def restricted(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, this user will only have explicit permissions granted.
        """
        return pulumi.get(self, "restricted")

    @restricted.setter
    def restricted(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "restricted", value)


@pulumi.input_type
class _UserState:
    def __init__(__self__, *,
                 email: Optional[pulumi.Input[str]] = None,
                 restricted: Optional[pulumi.Input[bool]] = None,
                 ssh_keys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tfa_enabled: Optional[pulumi.Input[bool]] = None,
                 username: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering User resources.
        :param pulumi.Input[str] email: The email address of the user.
        :param pulumi.Input[bool] restricted: If true, this user will only have explicit permissions granted.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ssh_keys: A list of the User's SSH keys.
        :param pulumi.Input[bool] tfa_enabled: Whether the user has two-factor-authentication enabled.
        :param pulumi.Input[str] username: The username of the user.
        """
        if email is not None:
            pulumi.set(__self__, "email", email)
        if restricted is not None:
            pulumi.set(__self__, "restricted", restricted)
        if ssh_keys is not None:
            pulumi.set(__self__, "ssh_keys", ssh_keys)
        if tfa_enabled is not None:
            pulumi.set(__self__, "tfa_enabled", tfa_enabled)
        if username is not None:
            pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter
    def email(self) -> Optional[pulumi.Input[str]]:
        """
        The email address of the user.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter
    def restricted(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, this user will only have explicit permissions granted.
        """
        return pulumi.get(self, "restricted")

    @restricted.setter
    def restricted(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "restricted", value)

    @property
    @pulumi.getter(name="sshKeys")
    def ssh_keys(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of the User's SSH keys.
        """
        return pulumi.get(self, "ssh_keys")

    @ssh_keys.setter
    def ssh_keys(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "ssh_keys", value)

    @property
    @pulumi.getter(name="tfaEnabled")
    def tfa_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the user has two-factor-authentication enabled.
        """
        return pulumi.get(self, "tfa_enabled")

    @tfa_enabled.setter
    def tfa_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "tfa_enabled", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        """
        The username of the user.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)


class User(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 restricted: Optional[pulumi.Input[bool]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Manages a Linode User.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_linode as linode

        john = linode.User("john",
            email="john@acme.io",
            restricted=True,
            username="john123")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] email: The email address of the user.
        :param pulumi.Input[bool] restricted: If true, this user will only have explicit permissions granted.
        :param pulumi.Input[str] username: The username of the user.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Linode User.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_linode as linode

        john = linode.User("john",
            email="john@acme.io",
            restricted=True,
            username="john123")
        ```

        :param str resource_name: The name of the resource.
        :param UserArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 restricted: Optional[pulumi.Input[bool]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
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
            __props__ = UserArgs.__new__(UserArgs)

            if email is None and not opts.urn:
                raise TypeError("Missing required property 'email'")
            __props__.__dict__["email"] = email
            __props__.__dict__["restricted"] = restricted
            if username is None and not opts.urn:
                raise TypeError("Missing required property 'username'")
            __props__.__dict__["username"] = username
            __props__.__dict__["ssh_keys"] = None
            __props__.__dict__["tfa_enabled"] = None
        super(User, __self__).__init__(
            'linode:index/user:User',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            email: Optional[pulumi.Input[str]] = None,
            restricted: Optional[pulumi.Input[bool]] = None,
            ssh_keys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            tfa_enabled: Optional[pulumi.Input[bool]] = None,
            username: Optional[pulumi.Input[str]] = None) -> 'User':
        """
        Get an existing User resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] email: The email address of the user.
        :param pulumi.Input[bool] restricted: If true, this user will only have explicit permissions granted.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ssh_keys: A list of the User's SSH keys.
        :param pulumi.Input[bool] tfa_enabled: Whether the user has two-factor-authentication enabled.
        :param pulumi.Input[str] username: The username of the user.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserState.__new__(_UserState)

        __props__.__dict__["email"] = email
        __props__.__dict__["restricted"] = restricted
        __props__.__dict__["ssh_keys"] = ssh_keys
        __props__.__dict__["tfa_enabled"] = tfa_enabled
        __props__.__dict__["username"] = username
        return User(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def email(self) -> pulumi.Output[str]:
        """
        The email address of the user.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter
    def restricted(self) -> pulumi.Output[Optional[bool]]:
        """
        If true, this user will only have explicit permissions granted.
        """
        return pulumi.get(self, "restricted")

    @property
    @pulumi.getter(name="sshKeys")
    def ssh_keys(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of the User's SSH keys.
        """
        return pulumi.get(self, "ssh_keys")

    @property
    @pulumi.getter(name="tfaEnabled")
    def tfa_enabled(self) -> pulumi.Output[bool]:
        """
        Whether the user has two-factor-authentication enabled.
        """
        return pulumi.get(self, "tfa_enabled")

    @property
    @pulumi.getter
    def username(self) -> pulumi.Output[str]:
        """
        The username of the user.
        """
        return pulumi.get(self, "username")

