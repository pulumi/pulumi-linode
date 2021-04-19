# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['SshKeyArgs', 'SshKey']

@pulumi.input_type
class SshKeyArgs:
    def __init__(__self__, *,
                 label: pulumi.Input[str],
                 ssh_key: pulumi.Input[str]):
        """
        The set of arguments for constructing a SshKey resource.
        :param pulumi.Input[str] label: A label for the SSH Key.
        :param pulumi.Input[str] ssh_key: The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
        """
        pulumi.set(__self__, "label", label)
        pulumi.set(__self__, "ssh_key", ssh_key)

    @property
    @pulumi.getter
    def label(self) -> pulumi.Input[str]:
        """
        A label for the SSH Key.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: pulumi.Input[str]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter(name="sshKey")
    def ssh_key(self) -> pulumi.Input[str]:
        """
        The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
        """
        return pulumi.get(self, "ssh_key")

    @ssh_key.setter
    def ssh_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "ssh_key", value)


@pulumi.input_type
class _SshKeyState:
    def __init__(__self__, *,
                 created: Optional[pulumi.Input[str]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 ssh_key: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SshKey resources.
        :param pulumi.Input[str] created: The date this key was added.
        :param pulumi.Input[str] label: A label for the SSH Key.
        :param pulumi.Input[str] ssh_key: The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
        """
        if created is not None:
            pulumi.set(__self__, "created", created)
        if label is not None:
            pulumi.set(__self__, "label", label)
        if ssh_key is not None:
            pulumi.set(__self__, "ssh_key", ssh_key)

    @property
    @pulumi.getter
    def created(self) -> Optional[pulumi.Input[str]]:
        """
        The date this key was added.
        """
        return pulumi.get(self, "created")

    @created.setter
    def created(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created", value)

    @property
    @pulumi.getter
    def label(self) -> Optional[pulumi.Input[str]]:
        """
        A label for the SSH Key.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter(name="sshKey")
    def ssh_key(self) -> Optional[pulumi.Input[str]]:
        """
        The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
        """
        return pulumi.get(self, "ssh_key")

    @ssh_key.setter
    def ssh_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ssh_key", value)


class SshKey(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 ssh_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Linode SSH Key resource.  This can be used to create, modify, and delete Linodes SSH Keys.  Managed SSH Keys allow instances to be created with a list of Linode usernames, whose SSH keys will be automatically applied to the root account's `~/.ssh/authorized_keys` file.
        For more information, see the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/getSSHKeys).

        ## Attributes

        This resource exports the following attributes:

        * `created` - The date this SSH Key was created.

        ## Import

        Linodes SSH Keys can be imported using the Linode SSH Key `id`, e.g.

        ```sh
         $ pulumi import linode:index/sshKey:SshKey mysshkey 1234567
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] label: A label for the SSH Key.
        :param pulumi.Input[str] ssh_key: The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SshKeyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Linode SSH Key resource.  This can be used to create, modify, and delete Linodes SSH Keys.  Managed SSH Keys allow instances to be created with a list of Linode usernames, whose SSH keys will be automatically applied to the root account's `~/.ssh/authorized_keys` file.
        For more information, see the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/getSSHKeys).

        ## Attributes

        This resource exports the following attributes:

        * `created` - The date this SSH Key was created.

        ## Import

        Linodes SSH Keys can be imported using the Linode SSH Key `id`, e.g.

        ```sh
         $ pulumi import linode:index/sshKey:SshKey mysshkey 1234567
        ```

        :param str resource_name: The name of the resource.
        :param SshKeyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SshKeyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 ssh_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SshKeyArgs.__new__(SshKeyArgs)

            if label is None and not opts.urn:
                raise TypeError("Missing required property 'label'")
            __props__.__dict__["label"] = label
            if ssh_key is None and not opts.urn:
                raise TypeError("Missing required property 'ssh_key'")
            __props__.__dict__["ssh_key"] = ssh_key
            __props__.__dict__["created"] = None
        super(SshKey, __self__).__init__(
            'linode:index/sshKey:SshKey',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created: Optional[pulumi.Input[str]] = None,
            label: Optional[pulumi.Input[str]] = None,
            ssh_key: Optional[pulumi.Input[str]] = None) -> 'SshKey':
        """
        Get an existing SshKey resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created: The date this key was added.
        :param pulumi.Input[str] label: A label for the SSH Key.
        :param pulumi.Input[str] ssh_key: The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SshKeyState.__new__(_SshKeyState)

        __props__.__dict__["created"] = created
        __props__.__dict__["label"] = label
        __props__.__dict__["ssh_key"] = ssh_key
        return SshKey(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def created(self) -> pulumi.Output[str]:
        """
        The date this key was added.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def label(self) -> pulumi.Output[str]:
        """
        A label for the SSH Key.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter(name="sshKey")
    def ssh_key(self) -> pulumi.Output[str]:
        """
        The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
        """
        return pulumi.get(self, "ssh_key")

