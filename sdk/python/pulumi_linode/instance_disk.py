# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['InstanceDiskInitArgs', 'InstanceDisk']

@pulumi.input_type
class InstanceDiskInitArgs:
    def __init__(__self__, *,
                 label: pulumi.Input[str],
                 linode_id: pulumi.Input[int],
                 size: pulumi.Input[int],
                 authorized_keys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 authorized_users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 filesystem: Optional[pulumi.Input[str]] = None,
                 image: Optional[pulumi.Input[str]] = None,
                 root_pass: Optional[pulumi.Input[str]] = None,
                 stackscript_data: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 stackscript_id: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a InstanceDisk resource.
        :param pulumi.Input[str] label: The Disk's label for display purposes only.
        :param pulumi.Input[int] linode_id: The ID of the Linode to create this Disk under.
        :param pulumi.Input[int] size: The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.
               
               - - -
        :param pulumi.Input[Sequence[pulumi.Input[str]]] authorized_keys: A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] authorized_users: A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the
        :param pulumi.Input[str] filesystem: The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
        :param pulumi.Input[str] image: An Image ID to deploy the Linode Disk from.
        :param pulumi.Input[str] root_pass: The root user’s password on a newly-created Linode Disk when deploying from an Image.
        :param pulumi.Input[Mapping[str, Any]] stackscript_data: An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscript_id` is given.
        :param pulumi.Input[int] stackscript_id: A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk.
        """
        InstanceDiskInitArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            label=label,
            linode_id=linode_id,
            size=size,
            authorized_keys=authorized_keys,
            authorized_users=authorized_users,
            filesystem=filesystem,
            image=image,
            root_pass=root_pass,
            stackscript_data=stackscript_data,
            stackscript_id=stackscript_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             label: Optional[pulumi.Input[str]] = None,
             linode_id: Optional[pulumi.Input[int]] = None,
             size: Optional[pulumi.Input[int]] = None,
             authorized_keys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             authorized_users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             filesystem: Optional[pulumi.Input[str]] = None,
             image: Optional[pulumi.Input[str]] = None,
             root_pass: Optional[pulumi.Input[str]] = None,
             stackscript_data: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             stackscript_id: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if label is None:
            raise TypeError("Missing 'label' argument")
        if linode_id is None and 'linodeId' in kwargs:
            linode_id = kwargs['linodeId']
        if linode_id is None:
            raise TypeError("Missing 'linode_id' argument")
        if size is None:
            raise TypeError("Missing 'size' argument")
        if authorized_keys is None and 'authorizedKeys' in kwargs:
            authorized_keys = kwargs['authorizedKeys']
        if authorized_users is None and 'authorizedUsers' in kwargs:
            authorized_users = kwargs['authorizedUsers']
        if root_pass is None and 'rootPass' in kwargs:
            root_pass = kwargs['rootPass']
        if stackscript_data is None and 'stackscriptData' in kwargs:
            stackscript_data = kwargs['stackscriptData']
        if stackscript_id is None and 'stackscriptId' in kwargs:
            stackscript_id = kwargs['stackscriptId']

        _setter("label", label)
        _setter("linode_id", linode_id)
        _setter("size", size)
        if authorized_keys is not None:
            _setter("authorized_keys", authorized_keys)
        if authorized_users is not None:
            _setter("authorized_users", authorized_users)
        if filesystem is not None:
            _setter("filesystem", filesystem)
        if image is not None:
            _setter("image", image)
        if root_pass is not None:
            _setter("root_pass", root_pass)
        if stackscript_data is not None:
            _setter("stackscript_data", stackscript_data)
        if stackscript_id is not None:
            _setter("stackscript_id", stackscript_id)

    @property
    @pulumi.getter
    def label(self) -> pulumi.Input[str]:
        """
        The Disk's label for display purposes only.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: pulumi.Input[str]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter(name="linodeId")
    def linode_id(self) -> pulumi.Input[int]:
        """
        The ID of the Linode to create this Disk under.
        """
        return pulumi.get(self, "linode_id")

    @linode_id.setter
    def linode_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "linode_id", value)

    @property
    @pulumi.getter
    def size(self) -> pulumi.Input[int]:
        """
        The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.

        - - -
        """
        return pulumi.get(self, "size")

    @size.setter
    def size(self, value: pulumi.Input[int]):
        pulumi.set(self, "size", value)

    @property
    @pulumi.getter(name="authorizedKeys")
    def authorized_keys(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image.
        """
        return pulumi.get(self, "authorized_keys")

    @authorized_keys.setter
    def authorized_keys(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "authorized_keys", value)

    @property
    @pulumi.getter(name="authorizedUsers")
    def authorized_users(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the
        """
        return pulumi.get(self, "authorized_users")

    @authorized_users.setter
    def authorized_users(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "authorized_users", value)

    @property
    @pulumi.getter
    def filesystem(self) -> Optional[pulumi.Input[str]]:
        """
        The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
        """
        return pulumi.get(self, "filesystem")

    @filesystem.setter
    def filesystem(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "filesystem", value)

    @property
    @pulumi.getter
    def image(self) -> Optional[pulumi.Input[str]]:
        """
        An Image ID to deploy the Linode Disk from.
        """
        return pulumi.get(self, "image")

    @image.setter
    def image(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "image", value)

    @property
    @pulumi.getter(name="rootPass")
    def root_pass(self) -> Optional[pulumi.Input[str]]:
        """
        The root user’s password on a newly-created Linode Disk when deploying from an Image.
        """
        return pulumi.get(self, "root_pass")

    @root_pass.setter
    def root_pass(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "root_pass", value)

    @property
    @pulumi.getter(name="stackscriptData")
    def stackscript_data(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscript_id` is given.
        """
        return pulumi.get(self, "stackscript_data")

    @stackscript_data.setter
    def stackscript_data(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "stackscript_data", value)

    @property
    @pulumi.getter(name="stackscriptId")
    def stackscript_id(self) -> Optional[pulumi.Input[int]]:
        """
        A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk.
        """
        return pulumi.get(self, "stackscript_id")

    @stackscript_id.setter
    def stackscript_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "stackscript_id", value)


@pulumi.input_type
class _InstanceDiskState:
    def __init__(__self__, *,
                 authorized_keys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 authorized_users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 created: Optional[pulumi.Input[str]] = None,
                 filesystem: Optional[pulumi.Input[str]] = None,
                 image: Optional[pulumi.Input[str]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 linode_id: Optional[pulumi.Input[int]] = None,
                 root_pass: Optional[pulumi.Input[str]] = None,
                 size: Optional[pulumi.Input[int]] = None,
                 stackscript_data: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 stackscript_id: Optional[pulumi.Input[int]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 updated: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering InstanceDisk resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] authorized_keys: A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] authorized_users: A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the
        :param pulumi.Input[str] created: When this disk was created.
        :param pulumi.Input[str] filesystem: The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
        :param pulumi.Input[str] image: An Image ID to deploy the Linode Disk from.
        :param pulumi.Input[str] label: The Disk's label for display purposes only.
        :param pulumi.Input[int] linode_id: The ID of the Linode to create this Disk under.
        :param pulumi.Input[str] root_pass: The root user’s password on a newly-created Linode Disk when deploying from an Image.
        :param pulumi.Input[int] size: The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.
               
               - - -
        :param pulumi.Input[Mapping[str, Any]] stackscript_data: An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscript_id` is given.
        :param pulumi.Input[int] stackscript_id: A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk.
        :param pulumi.Input[str] status: A brief description of this Disk's current state.
        :param pulumi.Input[str] updated: When this disk was last updated.
        """
        _InstanceDiskState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            authorized_keys=authorized_keys,
            authorized_users=authorized_users,
            created=created,
            filesystem=filesystem,
            image=image,
            label=label,
            linode_id=linode_id,
            root_pass=root_pass,
            size=size,
            stackscript_data=stackscript_data,
            stackscript_id=stackscript_id,
            status=status,
            updated=updated,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             authorized_keys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             authorized_users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             created: Optional[pulumi.Input[str]] = None,
             filesystem: Optional[pulumi.Input[str]] = None,
             image: Optional[pulumi.Input[str]] = None,
             label: Optional[pulumi.Input[str]] = None,
             linode_id: Optional[pulumi.Input[int]] = None,
             root_pass: Optional[pulumi.Input[str]] = None,
             size: Optional[pulumi.Input[int]] = None,
             stackscript_data: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             stackscript_id: Optional[pulumi.Input[int]] = None,
             status: Optional[pulumi.Input[str]] = None,
             updated: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if authorized_keys is None and 'authorizedKeys' in kwargs:
            authorized_keys = kwargs['authorizedKeys']
        if authorized_users is None and 'authorizedUsers' in kwargs:
            authorized_users = kwargs['authorizedUsers']
        if linode_id is None and 'linodeId' in kwargs:
            linode_id = kwargs['linodeId']
        if root_pass is None and 'rootPass' in kwargs:
            root_pass = kwargs['rootPass']
        if stackscript_data is None and 'stackscriptData' in kwargs:
            stackscript_data = kwargs['stackscriptData']
        if stackscript_id is None and 'stackscriptId' in kwargs:
            stackscript_id = kwargs['stackscriptId']

        if authorized_keys is not None:
            _setter("authorized_keys", authorized_keys)
        if authorized_users is not None:
            _setter("authorized_users", authorized_users)
        if created is not None:
            _setter("created", created)
        if filesystem is not None:
            _setter("filesystem", filesystem)
        if image is not None:
            _setter("image", image)
        if label is not None:
            _setter("label", label)
        if linode_id is not None:
            _setter("linode_id", linode_id)
        if root_pass is not None:
            _setter("root_pass", root_pass)
        if size is not None:
            _setter("size", size)
        if stackscript_data is not None:
            _setter("stackscript_data", stackscript_data)
        if stackscript_id is not None:
            _setter("stackscript_id", stackscript_id)
        if status is not None:
            _setter("status", status)
        if updated is not None:
            _setter("updated", updated)

    @property
    @pulumi.getter(name="authorizedKeys")
    def authorized_keys(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image.
        """
        return pulumi.get(self, "authorized_keys")

    @authorized_keys.setter
    def authorized_keys(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "authorized_keys", value)

    @property
    @pulumi.getter(name="authorizedUsers")
    def authorized_users(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the
        """
        return pulumi.get(self, "authorized_users")

    @authorized_users.setter
    def authorized_users(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "authorized_users", value)

    @property
    @pulumi.getter
    def created(self) -> Optional[pulumi.Input[str]]:
        """
        When this disk was created.
        """
        return pulumi.get(self, "created")

    @created.setter
    def created(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created", value)

    @property
    @pulumi.getter
    def filesystem(self) -> Optional[pulumi.Input[str]]:
        """
        The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
        """
        return pulumi.get(self, "filesystem")

    @filesystem.setter
    def filesystem(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "filesystem", value)

    @property
    @pulumi.getter
    def image(self) -> Optional[pulumi.Input[str]]:
        """
        An Image ID to deploy the Linode Disk from.
        """
        return pulumi.get(self, "image")

    @image.setter
    def image(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "image", value)

    @property
    @pulumi.getter
    def label(self) -> Optional[pulumi.Input[str]]:
        """
        The Disk's label for display purposes only.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter(name="linodeId")
    def linode_id(self) -> Optional[pulumi.Input[int]]:
        """
        The ID of the Linode to create this Disk under.
        """
        return pulumi.get(self, "linode_id")

    @linode_id.setter
    def linode_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "linode_id", value)

    @property
    @pulumi.getter(name="rootPass")
    def root_pass(self) -> Optional[pulumi.Input[str]]:
        """
        The root user’s password on a newly-created Linode Disk when deploying from an Image.
        """
        return pulumi.get(self, "root_pass")

    @root_pass.setter
    def root_pass(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "root_pass", value)

    @property
    @pulumi.getter
    def size(self) -> Optional[pulumi.Input[int]]:
        """
        The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.

        - - -
        """
        return pulumi.get(self, "size")

    @size.setter
    def size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "size", value)

    @property
    @pulumi.getter(name="stackscriptData")
    def stackscript_data(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscript_id` is given.
        """
        return pulumi.get(self, "stackscript_data")

    @stackscript_data.setter
    def stackscript_data(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "stackscript_data", value)

    @property
    @pulumi.getter(name="stackscriptId")
    def stackscript_id(self) -> Optional[pulumi.Input[int]]:
        """
        A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk.
        """
        return pulumi.get(self, "stackscript_id")

    @stackscript_id.setter
    def stackscript_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "stackscript_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        A brief description of this Disk's current state.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def updated(self) -> Optional[pulumi.Input[str]]:
        """
        When this disk was last updated.
        """
        return pulumi.get(self, "updated")

    @updated.setter
    def updated(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated", value)


class InstanceDisk(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authorized_keys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 authorized_users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 filesystem: Optional[pulumi.Input[str]] = None,
                 image: Optional[pulumi.Input[str]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 linode_id: Optional[pulumi.Input[int]] = None,
                 root_pass: Optional[pulumi.Input[str]] = None,
                 size: Optional[pulumi.Input[int]] = None,
                 stackscript_data: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 stackscript_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides a Linode Instance Disk resource. This can be used to create, modify, and delete Linode Instance Disks.

        **NOTE:** Deleting a disk will shut down the attached instance if the instance is booted. If the disk was not in use by the booted configuration profile, the instance will be automatically rebooted.

        ## Import

        Instance Disks can be imported using the `linode_id` followed by the Instance Disk `id` separated by a comma, e.g.

        ```sh
         $ pulumi import linode:index/instanceDisk:InstanceDisk my-disk 1234567,7654321
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] authorized_keys: A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] authorized_users: A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the
        :param pulumi.Input[str] filesystem: The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
        :param pulumi.Input[str] image: An Image ID to deploy the Linode Disk from.
        :param pulumi.Input[str] label: The Disk's label for display purposes only.
        :param pulumi.Input[int] linode_id: The ID of the Linode to create this Disk under.
        :param pulumi.Input[str] root_pass: The root user’s password on a newly-created Linode Disk when deploying from an Image.
        :param pulumi.Input[int] size: The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.
               
               - - -
        :param pulumi.Input[Mapping[str, Any]] stackscript_data: An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscript_id` is given.
        :param pulumi.Input[int] stackscript_id: A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: InstanceDiskInitArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Linode Instance Disk resource. This can be used to create, modify, and delete Linode Instance Disks.

        **NOTE:** Deleting a disk will shut down the attached instance if the instance is booted. If the disk was not in use by the booted configuration profile, the instance will be automatically rebooted.

        ## Import

        Instance Disks can be imported using the `linode_id` followed by the Instance Disk `id` separated by a comma, e.g.

        ```sh
         $ pulumi import linode:index/instanceDisk:InstanceDisk my-disk 1234567,7654321
        ```

        :param str resource_name: The name of the resource.
        :param InstanceDiskInitArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(InstanceDiskInitArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            InstanceDiskInitArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authorized_keys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 authorized_users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 filesystem: Optional[pulumi.Input[str]] = None,
                 image: Optional[pulumi.Input[str]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 linode_id: Optional[pulumi.Input[int]] = None,
                 root_pass: Optional[pulumi.Input[str]] = None,
                 size: Optional[pulumi.Input[int]] = None,
                 stackscript_data: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 stackscript_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = InstanceDiskInitArgs.__new__(InstanceDiskInitArgs)

            __props__.__dict__["authorized_keys"] = authorized_keys
            __props__.__dict__["authorized_users"] = authorized_users
            __props__.__dict__["filesystem"] = filesystem
            __props__.__dict__["image"] = image
            if label is None and not opts.urn:
                raise TypeError("Missing required property 'label'")
            __props__.__dict__["label"] = label
            if linode_id is None and not opts.urn:
                raise TypeError("Missing required property 'linode_id'")
            __props__.__dict__["linode_id"] = linode_id
            __props__.__dict__["root_pass"] = None if root_pass is None else pulumi.Output.secret(root_pass)
            if size is None and not opts.urn:
                raise TypeError("Missing required property 'size'")
            __props__.__dict__["size"] = size
            __props__.__dict__["stackscript_data"] = None if stackscript_data is None else pulumi.Output.secret(stackscript_data)
            __props__.__dict__["stackscript_id"] = stackscript_id
            __props__.__dict__["created"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["updated"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["rootPass", "stackscriptData"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(InstanceDisk, __self__).__init__(
            'linode:index/instanceDisk:InstanceDisk',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            authorized_keys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            authorized_users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            created: Optional[pulumi.Input[str]] = None,
            filesystem: Optional[pulumi.Input[str]] = None,
            image: Optional[pulumi.Input[str]] = None,
            label: Optional[pulumi.Input[str]] = None,
            linode_id: Optional[pulumi.Input[int]] = None,
            root_pass: Optional[pulumi.Input[str]] = None,
            size: Optional[pulumi.Input[int]] = None,
            stackscript_data: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            stackscript_id: Optional[pulumi.Input[int]] = None,
            status: Optional[pulumi.Input[str]] = None,
            updated: Optional[pulumi.Input[str]] = None) -> 'InstanceDisk':
        """
        Get an existing InstanceDisk resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] authorized_keys: A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] authorized_users: A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the
        :param pulumi.Input[str] created: When this disk was created.
        :param pulumi.Input[str] filesystem: The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
        :param pulumi.Input[str] image: An Image ID to deploy the Linode Disk from.
        :param pulumi.Input[str] label: The Disk's label for display purposes only.
        :param pulumi.Input[int] linode_id: The ID of the Linode to create this Disk under.
        :param pulumi.Input[str] root_pass: The root user’s password on a newly-created Linode Disk when deploying from an Image.
        :param pulumi.Input[int] size: The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.
               
               - - -
        :param pulumi.Input[Mapping[str, Any]] stackscript_data: An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscript_id` is given.
        :param pulumi.Input[int] stackscript_id: A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk.
        :param pulumi.Input[str] status: A brief description of this Disk's current state.
        :param pulumi.Input[str] updated: When this disk was last updated.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _InstanceDiskState.__new__(_InstanceDiskState)

        __props__.__dict__["authorized_keys"] = authorized_keys
        __props__.__dict__["authorized_users"] = authorized_users
        __props__.__dict__["created"] = created
        __props__.__dict__["filesystem"] = filesystem
        __props__.__dict__["image"] = image
        __props__.__dict__["label"] = label
        __props__.__dict__["linode_id"] = linode_id
        __props__.__dict__["root_pass"] = root_pass
        __props__.__dict__["size"] = size
        __props__.__dict__["stackscript_data"] = stackscript_data
        __props__.__dict__["stackscript_id"] = stackscript_id
        __props__.__dict__["status"] = status
        __props__.__dict__["updated"] = updated
        return InstanceDisk(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="authorizedKeys")
    def authorized_keys(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image.
        """
        return pulumi.get(self, "authorized_keys")

    @property
    @pulumi.getter(name="authorizedUsers")
    def authorized_users(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the
        """
        return pulumi.get(self, "authorized_users")

    @property
    @pulumi.getter
    def created(self) -> pulumi.Output[str]:
        """
        When this disk was created.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def filesystem(self) -> pulumi.Output[str]:
        """
        The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
        """
        return pulumi.get(self, "filesystem")

    @property
    @pulumi.getter
    def image(self) -> pulumi.Output[Optional[str]]:
        """
        An Image ID to deploy the Linode Disk from.
        """
        return pulumi.get(self, "image")

    @property
    @pulumi.getter
    def label(self) -> pulumi.Output[str]:
        """
        The Disk's label for display purposes only.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter(name="linodeId")
    def linode_id(self) -> pulumi.Output[int]:
        """
        The ID of the Linode to create this Disk under.
        """
        return pulumi.get(self, "linode_id")

    @property
    @pulumi.getter(name="rootPass")
    def root_pass(self) -> pulumi.Output[Optional[str]]:
        """
        The root user’s password on a newly-created Linode Disk when deploying from an Image.
        """
        return pulumi.get(self, "root_pass")

    @property
    @pulumi.getter
    def size(self) -> pulumi.Output[int]:
        """
        The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.

        - - -
        """
        return pulumi.get(self, "size")

    @property
    @pulumi.getter(name="stackscriptData")
    def stackscript_data(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscript_id` is given.
        """
        return pulumi.get(self, "stackscript_data")

    @property
    @pulumi.getter(name="stackscriptId")
    def stackscript_id(self) -> pulumi.Output[Optional[int]]:
        """
        A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk.
        """
        return pulumi.get(self, "stackscript_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        A brief description of this Disk's current state.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def updated(self) -> pulumi.Output[str]:
        """
        When this disk was last updated.
        """
        return pulumi.get(self, "updated")

