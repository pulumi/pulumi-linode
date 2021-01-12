# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['Instance']


class Instance(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alerts: Optional[pulumi.Input[pulumi.InputType['InstanceAlertsArgs']]] = None,
                 authorized_keys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 authorized_users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 backup_id: Optional[pulumi.Input[int]] = None,
                 backups_enabled: Optional[pulumi.Input[bool]] = None,
                 boot_config_label: Optional[pulumi.Input[str]] = None,
                 configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['InstanceConfigArgs']]]]] = None,
                 disks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['InstanceDiskArgs']]]]] = None,
                 group: Optional[pulumi.Input[str]] = None,
                 image: Optional[pulumi.Input[str]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 private_ip: Optional[pulumi.Input[bool]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 root_pass: Optional[pulumi.Input[str]] = None,
                 stackscript_data: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 stackscript_id: Optional[pulumi.Input[int]] = None,
                 swap_size: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 watchdog_enabled: Optional[pulumi.Input[bool]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Linode Instance resource.  This can be used to create, modify, and delete Linodes.
        For more information, see [Getting Started with Linode](https://linode.com/docs/getting-started/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createLinodeInstance).

        ## Example Usage
        ### Simple Linode Instance

        The following example shows how one might use this resource to configure a Linode instance.

        ```python
        import pulumi
        import pulumi_linode as linode

        web = linode.Instance("web",
            authorized_keys=["ssh-rsa AAAA...Gw== user@example.local"],
            group="foo",
            image="linode/ubuntu18.04",
            label="simple_instance",
            private_ip=True,
            region="us-central",
            root_pass="terr4form-test",
            swap_size=256,
            tags=["foo"],
            type="g6-standard-1")
        ```
        ### Linode Instance with explicit Configs and Disks

        Using explicit Instance Configs and Disks it is possible to create a more elaborate Linode instance.  This can be used to provision multiple disks and volumes during Instance creation.

        ```python
        import pulumi
        import pulumi_linode as linode

        me = linode.get_profile()
        web_volume = linode.Volume("webVolume",
            label="web_volume",
            region="us-central",
            size=20)
        web = linode.Instance("web",
            boot_config_label="boot_config",
            configs=[linode.InstanceConfigArgs(
                devices=linode.InstanceConfigDevicesArgs(
                    sda=linode.InstanceConfigDevicesSdaArgs(
                        disk_label="boot",
                    ),
                    sdb=linode.InstanceConfigDevicesSdbArgs(
                        volume_id=web_volume.id,
                    ),
                ),
                kernel="linode/latest-64bit",
                label="boot_config",
                root_device="/dev/sda",
            )],
            disks=[linode.InstanceDiskArgs(
                authorized_keys=["ssh-rsa AAAA...Gw== user@example.local"],
                authorized_users=[me.username],
                image="linode/ubuntu18.04",
                label="boot",
                root_pass="terr4form-test",
                size=3000,
            )],
            group="foo",
            label="complex_instance",
            private_ip=True,
            region="us-central",
            tags=["foo"],
            type="g6-nanode-1")
        ```
        ## Attributes

        This Linode Instance resource exports the following attributes:

        * `status` - The status of the instance, indicating the current readiness state. (`running`, `offline`, ...)

        * `ip_address` - A string containing the Linode's public IP address.

        * `private_ip_address` - This Linode's Private IPv4 Address, if enabled.  The regional private IP address range, 192.168.128.0/17, is shared by all Linode Instances in a region.

        * `ipv6` - This Linode's IPv6 SLAAC addresses. This address is specific to a Linode, and may not be shared.  The prefix (`/64`) is included in this attribute.

        * `ipv4` - This Linode's IPv4 Addresses. Each Linode is assigned a single public IPv4 address upon creation, and may get a single private IPv4 address if needed. You may need to open a support ticket to get additional IPv4 addresses.

        * `specs.0.disk` -  The amount of storage space, in GB. this Linode has access to. A typical Linode will divide this space between a primary disk with an image deployed to it, and a swap disk, usually 512 MB. This is the default configuration created when deploying a Linode with an image through POST /linode/instances.

        * `specs.0.memory` - The amount of RAM, in MB, this Linode has access to. Typically a Linode will choose to boot with all of its available RAM, but this can be configured in a Config profile.

        * `specs.0.vcpus` - The number of vcpus this Linode has access to. Typically a Linode will choose to boot with all of its available vcpus, but this can be configured in a Config Profile.

        * `specs.0.transfer` - The amount of network transfer this Linode is allotted each month.

        * `backups` - Information about this Linode's backups status.
          
          * `enabled` - If this Linode has the Backup service enabled.
          
          * `schedule`
            
            * `day` -  The day of the week that your Linode's weekly Backup is taken. If not set manually, a day will be chosen for you. Backups are taken every day, but backups taken on this day are preferred when selecting backups to retain for a longer period.  If not set manually, then when backups are initially enabled, this may come back as "Scheduling" until the day is automatically selected.
            
            * `window` - The window ('W0'-'W22') in which your backups will be taken, in UTC. A backups window is a two-hour span of time in which the backup may occur. For example, 'W10' indicates that your backups should be taken between 10:00 and 12:00. If you do not choose a backup window, one will be selected for you automatically.  If not set manually, when backups are initially enabled this may come back as Scheduling until the window is automatically selected.

        ## Import

        Linodes Instances can be imported using the Linode `id`, e.g.

        ```sh
         $ pulumi import linode:index/instance:Instance mylinode 1234567
        ```

         When importing an instance, all `disk` and `config` values must be represented. Imported disks must include their `label` value.

        **Any disk that is not precisely represented may be removed resulting in data loss.** Imported configs should include all `devices`, and must include `label`, `kernel`, and the `root_device`.

        The instance must include a `boot_config_label` referring to the correct configuration profile. The Linode Guide, [Import Existing Infrastructure to Terraform](https://www.linode.com/docs/applications/configuration-management/import-existing-infrastructure-to-terraform/), offers resource importing examples for Instances and other Linode resource types.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] authorized_keys: A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if `image` is provided. *This value can not be imported.* *Changing `authorized_keys` forces the creation of a new Linode Instance.*
        :param pulumi.Input[Sequence[pulumi.Input[str]]] authorized_users: A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user's `~/.ssh/authorized_keys` file automatically. *This value can not be imported.* *Changing `authorized_users` forces the creation of a new Linode Instance.*
        :param pulumi.Input[int] backup_id: A Backup ID from another Linode's available backups. Your User must have read_write access to that Linode, the Backup must have a status of successful, and the Linode must be deployed to the same region as the Backup. See /linode/instances/{linodeId}/backups for a Linode's available backups. This field and the image field are mutually exclusive. *This value can not be imported.* *Changing `backup_id` forces the creation of a new Linode Instance.*
        :param pulumi.Input[bool] backups_enabled: If this field is set to true, the created Linode will automatically be enrolled in the Linode Backup service. This will incur an additional charge. The cost for the Backup service is dependent on the Type of Linode deployed.
        :param pulumi.Input[str] boot_config_label: The Label of the Instance Config that should be used to boot the Linode instance.  If there is only one `config`, the `label` of that `config` will be used as the `boot_config_label`. *This value can not be imported.*
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['InstanceConfigArgs']]]] configs: Configuration profiles define the VM settings and boot behavior of the Linode Instance.
        :param pulumi.Input[str] group: The display group of the Linode instance.
        :param pulumi.Input[str] image: An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian9`, `linode/fedora28`, `linode/ubuntu16.04lts`, `linode/arch`, and `private/12345`. See all images [here](https://api.linode.com/v4/linode/kernels). *Changing `image` forces the creation of a new Linode Instance.*
        :param pulumi.Input[str] label: The Config's label for display purposes.  Also used by `boot_config_label`.
        :param pulumi.Input[bool] private_ip: If true, the created Linode will have private networking enabled, allowing use of the 192.168.128.0/17 network within the Linode's region. It can be enabled on an existing Linode but it can't be disabled.
        :param pulumi.Input[str] region: This is the location where the Linode is deployed. Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions). *Changing `region` forces the creation of a new Linode Instance.*.
        :param pulumi.Input[str] root_pass: The initial password for the `root` user account. *This value can not be imported.* *Changing `root_pass` forces the creation of a new Linode Instance.* *If omitted, a random password will be generated but will not be stored in state.*
        :param pulumi.Input[Mapping[str, Any]] stackscript_data: An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if 'stackscript_id' is given. The required values depend on the StackScript being deployed.  *This value can not be imported.* *Changing `stackscript_data` forces the creation of a new Linode Instance.*
        :param pulumi.Input[int] stackscript_id: The StackScript to deploy to the newly created Linode. If provided, 'image' must also be provided, and must be an Image that is compatible with this StackScript. *This value can not be imported.* *Changing `stackscript_id` forces the creation of a new Linode Instance.*
        :param pulumi.Input[int] swap_size: When deploying from an Image, this field is optional with a Linode API default of 512mb, otherwise it is ignored. This is used to set the swap disk size for the newly-created Linode.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of tags applied to this object. Tags are for organizational purposes only.
        :param pulumi.Input[str] type: The Linode type defines the pricing, CPU, disk, and RAM specs of the instance. Examples are `"g6-nanode-1"`, `"g6-standard-2"`, `"g6-highmem-16"`, `"g6-dedicated-16"`, etc. See all types [here](https://api.linode.com/v4/linode/types).
        :param pulumi.Input[bool] watchdog_enabled: The watchdog, named Lassie, is a Shutdown Watchdog that monitors your Linode and will reboot it if it powers off unexpectedly. It works by issuing a boot job when your Linode powers off without a shutdown job being responsible. To prevent a loop, Lassie will give up if there have been more than 5 boot jobs issued within 15 minutes.
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

            __props__['alerts'] = alerts
            __props__['authorized_keys'] = authorized_keys
            __props__['authorized_users'] = authorized_users
            __props__['backup_id'] = backup_id
            __props__['backups_enabled'] = backups_enabled
            __props__['boot_config_label'] = boot_config_label
            __props__['configs'] = configs
            __props__['disks'] = disks
            __props__['group'] = group
            __props__['image'] = image
            __props__['label'] = label
            __props__['private_ip'] = private_ip
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__['region'] = region
            __props__['root_pass'] = root_pass
            __props__['stackscript_data'] = stackscript_data
            __props__['stackscript_id'] = stackscript_id
            __props__['swap_size'] = swap_size
            __props__['tags'] = tags
            __props__['type'] = type
            __props__['watchdog_enabled'] = watchdog_enabled
            __props__['backups'] = None
            __props__['ip_address'] = None
            __props__['ipv4s'] = None
            __props__['ipv6'] = None
            __props__['private_ip_address'] = None
            __props__['specs'] = None
            __props__['status'] = None
        super(Instance, __self__).__init__(
            'linode:index/instance:Instance',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            alerts: Optional[pulumi.Input[pulumi.InputType['InstanceAlertsArgs']]] = None,
            authorized_keys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            authorized_users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            backup_id: Optional[pulumi.Input[int]] = None,
            backups: Optional[pulumi.Input[pulumi.InputType['InstanceBackupsArgs']]] = None,
            backups_enabled: Optional[pulumi.Input[bool]] = None,
            boot_config_label: Optional[pulumi.Input[str]] = None,
            configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['InstanceConfigArgs']]]]] = None,
            disks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['InstanceDiskArgs']]]]] = None,
            group: Optional[pulumi.Input[str]] = None,
            image: Optional[pulumi.Input[str]] = None,
            ip_address: Optional[pulumi.Input[str]] = None,
            ipv4s: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            ipv6: Optional[pulumi.Input[str]] = None,
            label: Optional[pulumi.Input[str]] = None,
            private_ip: Optional[pulumi.Input[bool]] = None,
            private_ip_address: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            root_pass: Optional[pulumi.Input[str]] = None,
            specs: Optional[pulumi.Input[pulumi.InputType['InstanceSpecsArgs']]] = None,
            stackscript_data: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            stackscript_id: Optional[pulumi.Input[int]] = None,
            status: Optional[pulumi.Input[str]] = None,
            swap_size: Optional[pulumi.Input[int]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            type: Optional[pulumi.Input[str]] = None,
            watchdog_enabled: Optional[pulumi.Input[bool]] = None) -> 'Instance':
        """
        Get an existing Instance resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] authorized_keys: A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if `image` is provided. *This value can not be imported.* *Changing `authorized_keys` forces the creation of a new Linode Instance.*
        :param pulumi.Input[Sequence[pulumi.Input[str]]] authorized_users: A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user's `~/.ssh/authorized_keys` file automatically. *This value can not be imported.* *Changing `authorized_users` forces the creation of a new Linode Instance.*
        :param pulumi.Input[int] backup_id: A Backup ID from another Linode's available backups. Your User must have read_write access to that Linode, the Backup must have a status of successful, and the Linode must be deployed to the same region as the Backup. See /linode/instances/{linodeId}/backups for a Linode's available backups. This field and the image field are mutually exclusive. *This value can not be imported.* *Changing `backup_id` forces the creation of a new Linode Instance.*
        :param pulumi.Input[pulumi.InputType['InstanceBackupsArgs']] backups: Information about this Linode's backups status.
        :param pulumi.Input[bool] backups_enabled: If this field is set to true, the created Linode will automatically be enrolled in the Linode Backup service. This will incur an additional charge. The cost for the Backup service is dependent on the Type of Linode deployed.
        :param pulumi.Input[str] boot_config_label: The Label of the Instance Config that should be used to boot the Linode instance.  If there is only one `config`, the `label` of that `config` will be used as the `boot_config_label`. *This value can not be imported.*
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['InstanceConfigArgs']]]] configs: Configuration profiles define the VM settings and boot behavior of the Linode Instance.
        :param pulumi.Input[str] group: The display group of the Linode instance.
        :param pulumi.Input[str] image: An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian9`, `linode/fedora28`, `linode/ubuntu16.04lts`, `linode/arch`, and `private/12345`. See all images [here](https://api.linode.com/v4/linode/kernels). *Changing `image` forces the creation of a new Linode Instance.*
        :param pulumi.Input[str] ip_address: This Linode's Public IPv4 Address. If there are multiple public IPv4 addresses on this Instance, an arbitrary address
               will be used for this field.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ipv4s: This Linode's IPv4 Addresses. Each Linode is assigned a single public IPv4 address upon creation, and may get a single
               private IPv4 address if needed. You may need to open a support ticket to get additional IPv4 addresses.
        :param pulumi.Input[str] ipv6: This Linode's IPv6 SLAAC addresses. This address is specific to a Linode, and may not be shared.
        :param pulumi.Input[str] label: The Config's label for display purposes.  Also used by `boot_config_label`.
        :param pulumi.Input[bool] private_ip: If true, the created Linode will have private networking enabled, allowing use of the 192.168.128.0/17 network within the Linode's region. It can be enabled on an existing Linode but it can't be disabled.
        :param pulumi.Input[str] private_ip_address: This Linode's Private IPv4 Address. The regional private IP address range is 192.168.128/17 address shared by all Linode
               Instances in a region.
        :param pulumi.Input[str] region: This is the location where the Linode is deployed. Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions). *Changing `region` forces the creation of a new Linode Instance.*.
        :param pulumi.Input[str] root_pass: The initial password for the `root` user account. *This value can not be imported.* *Changing `root_pass` forces the creation of a new Linode Instance.* *If omitted, a random password will be generated but will not be stored in state.*
        :param pulumi.Input[Mapping[str, Any]] stackscript_data: An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if 'stackscript_id' is given. The required values depend on the StackScript being deployed.  *This value can not be imported.* *Changing `stackscript_data` forces the creation of a new Linode Instance.*
        :param pulumi.Input[int] stackscript_id: The StackScript to deploy to the newly created Linode. If provided, 'image' must also be provided, and must be an Image that is compatible with this StackScript. *This value can not be imported.* *Changing `stackscript_id` forces the creation of a new Linode Instance.*
        :param pulumi.Input[str] status: The status of the instance, indicating the current readiness state.
        :param pulumi.Input[int] swap_size: When deploying from an Image, this field is optional with a Linode API default of 512mb, otherwise it is ignored. This is used to set the swap disk size for the newly-created Linode.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of tags applied to this object. Tags are for organizational purposes only.
        :param pulumi.Input[str] type: The Linode type defines the pricing, CPU, disk, and RAM specs of the instance. Examples are `"g6-nanode-1"`, `"g6-standard-2"`, `"g6-highmem-16"`, `"g6-dedicated-16"`, etc. See all types [here](https://api.linode.com/v4/linode/types).
        :param pulumi.Input[bool] watchdog_enabled: The watchdog, named Lassie, is a Shutdown Watchdog that monitors your Linode and will reboot it if it powers off unexpectedly. It works by issuing a boot job when your Linode powers off without a shutdown job being responsible. To prevent a loop, Lassie will give up if there have been more than 5 boot jobs issued within 15 minutes.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["alerts"] = alerts
        __props__["authorized_keys"] = authorized_keys
        __props__["authorized_users"] = authorized_users
        __props__["backup_id"] = backup_id
        __props__["backups"] = backups
        __props__["backups_enabled"] = backups_enabled
        __props__["boot_config_label"] = boot_config_label
        __props__["configs"] = configs
        __props__["disks"] = disks
        __props__["group"] = group
        __props__["image"] = image
        __props__["ip_address"] = ip_address
        __props__["ipv4s"] = ipv4s
        __props__["ipv6"] = ipv6
        __props__["label"] = label
        __props__["private_ip"] = private_ip
        __props__["private_ip_address"] = private_ip_address
        __props__["region"] = region
        __props__["root_pass"] = root_pass
        __props__["specs"] = specs
        __props__["stackscript_data"] = stackscript_data
        __props__["stackscript_id"] = stackscript_id
        __props__["status"] = status
        __props__["swap_size"] = swap_size
        __props__["tags"] = tags
        __props__["type"] = type
        __props__["watchdog_enabled"] = watchdog_enabled
        return Instance(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def alerts(self) -> pulumi.Output['outputs.InstanceAlerts']:
        return pulumi.get(self, "alerts")

    @property
    @pulumi.getter(name="authorizedKeys")
    def authorized_keys(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if `image` is provided. *This value can not be imported.* *Changing `authorized_keys` forces the creation of a new Linode Instance.*
        """
        return pulumi.get(self, "authorized_keys")

    @property
    @pulumi.getter(name="authorizedUsers")
    def authorized_users(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user's `~/.ssh/authorized_keys` file automatically. *This value can not be imported.* *Changing `authorized_users` forces the creation of a new Linode Instance.*
        """
        return pulumi.get(self, "authorized_users")

    @property
    @pulumi.getter(name="backupId")
    def backup_id(self) -> pulumi.Output[Optional[int]]:
        """
        A Backup ID from another Linode's available backups. Your User must have read_write access to that Linode, the Backup must have a status of successful, and the Linode must be deployed to the same region as the Backup. See /linode/instances/{linodeId}/backups for a Linode's available backups. This field and the image field are mutually exclusive. *This value can not be imported.* *Changing `backup_id` forces the creation of a new Linode Instance.*
        """
        return pulumi.get(self, "backup_id")

    @property
    @pulumi.getter
    def backups(self) -> pulumi.Output['outputs.InstanceBackups']:
        """
        Information about this Linode's backups status.
        """
        return pulumi.get(self, "backups")

    @property
    @pulumi.getter(name="backupsEnabled")
    def backups_enabled(self) -> pulumi.Output[bool]:
        """
        If this field is set to true, the created Linode will automatically be enrolled in the Linode Backup service. This will incur an additional charge. The cost for the Backup service is dependent on the Type of Linode deployed.
        """
        return pulumi.get(self, "backups_enabled")

    @property
    @pulumi.getter(name="bootConfigLabel")
    def boot_config_label(self) -> pulumi.Output[str]:
        """
        The Label of the Instance Config that should be used to boot the Linode instance.  If there is only one `config`, the `label` of that `config` will be used as the `boot_config_label`. *This value can not be imported.*
        """
        return pulumi.get(self, "boot_config_label")

    @property
    @pulumi.getter
    def configs(self) -> pulumi.Output[Optional[Sequence['outputs.InstanceConfig']]]:
        """
        Configuration profiles define the VM settings and boot behavior of the Linode Instance.
        """
        return pulumi.get(self, "configs")

    @property
    @pulumi.getter
    def disks(self) -> pulumi.Output[Optional[Sequence['outputs.InstanceDisk']]]:
        return pulumi.get(self, "disks")

    @property
    @pulumi.getter
    def group(self) -> pulumi.Output[Optional[str]]:
        """
        The display group of the Linode instance.
        """
        return pulumi.get(self, "group")

    @property
    @pulumi.getter
    def image(self) -> pulumi.Output[Optional[str]]:
        """
        An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian9`, `linode/fedora28`, `linode/ubuntu16.04lts`, `linode/arch`, and `private/12345`. See all images [here](https://api.linode.com/v4/linode/kernels). *Changing `image` forces the creation of a new Linode Instance.*
        """
        return pulumi.get(self, "image")

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> pulumi.Output[str]:
        """
        This Linode's Public IPv4 Address. If there are multiple public IPv4 addresses on this Instance, an arbitrary address
        will be used for this field.
        """
        return pulumi.get(self, "ip_address")

    @property
    @pulumi.getter
    def ipv4s(self) -> pulumi.Output[Sequence[str]]:
        """
        This Linode's IPv4 Addresses. Each Linode is assigned a single public IPv4 address upon creation, and may get a single
        private IPv4 address if needed. You may need to open a support ticket to get additional IPv4 addresses.
        """
        return pulumi.get(self, "ipv4s")

    @property
    @pulumi.getter
    def ipv6(self) -> pulumi.Output[str]:
        """
        This Linode's IPv6 SLAAC addresses. This address is specific to a Linode, and may not be shared.
        """
        return pulumi.get(self, "ipv6")

    @property
    @pulumi.getter
    def label(self) -> pulumi.Output[str]:
        """
        The Config's label for display purposes.  Also used by `boot_config_label`.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter(name="privateIp")
    def private_ip(self) -> pulumi.Output[Optional[bool]]:
        """
        If true, the created Linode will have private networking enabled, allowing use of the 192.168.128.0/17 network within the Linode's region. It can be enabled on an existing Linode but it can't be disabled.
        """
        return pulumi.get(self, "private_ip")

    @property
    @pulumi.getter(name="privateIpAddress")
    def private_ip_address(self) -> pulumi.Output[str]:
        """
        This Linode's Private IPv4 Address. The regional private IP address range is 192.168.128/17 address shared by all Linode
        Instances in a region.
        """
        return pulumi.get(self, "private_ip_address")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        This is the location where the Linode is deployed. Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions). *Changing `region` forces the creation of a new Linode Instance.*.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="rootPass")
    def root_pass(self) -> pulumi.Output[Optional[str]]:
        """
        The initial password for the `root` user account. *This value can not be imported.* *Changing `root_pass` forces the creation of a new Linode Instance.* *If omitted, a random password will be generated but will not be stored in state.*
        """
        return pulumi.get(self, "root_pass")

    @property
    @pulumi.getter
    def specs(self) -> pulumi.Output['outputs.InstanceSpecs']:
        return pulumi.get(self, "specs")

    @property
    @pulumi.getter(name="stackscriptData")
    def stackscript_data(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if 'stackscript_id' is given. The required values depend on the StackScript being deployed.  *This value can not be imported.* *Changing `stackscript_data` forces the creation of a new Linode Instance.*
        """
        return pulumi.get(self, "stackscript_data")

    @property
    @pulumi.getter(name="stackscriptId")
    def stackscript_id(self) -> pulumi.Output[Optional[int]]:
        """
        The StackScript to deploy to the newly created Linode. If provided, 'image' must also be provided, and must be an Image that is compatible with this StackScript. *This value can not be imported.* *Changing `stackscript_id` forces the creation of a new Linode Instance.*
        """
        return pulumi.get(self, "stackscript_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the instance, indicating the current readiness state.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="swapSize")
    def swap_size(self) -> pulumi.Output[int]:
        """
        When deploying from an Image, this field is optional with a Linode API default of 512mb, otherwise it is ignored. This is used to set the swap disk size for the newly-created Linode.
        """
        return pulumi.get(self, "swap_size")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of tags applied to this object. Tags are for organizational purposes only.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[str]]:
        """
        The Linode type defines the pricing, CPU, disk, and RAM specs of the instance. Examples are `"g6-nanode-1"`, `"g6-standard-2"`, `"g6-highmem-16"`, `"g6-dedicated-16"`, etc. See all types [here](https://api.linode.com/v4/linode/types).
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="watchdogEnabled")
    def watchdog_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        The watchdog, named Lassie, is a Shutdown Watchdog that monitors your Linode and will reboot it if it powers off unexpectedly. It works by issuing a boot job when your Linode powers off without a shutdown job being responsible. To prevent a loop, Lassie will give up if there have been more than 5 boot jobs issued within 15 minutes.
        """
        return pulumi.get(self, "watchdog_enabled")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

