# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from . import utilities, tables

class Instance(pulumi.CustomResource):
    alerts: pulumi.Output[dict]
    authorized_keys: pulumi.Output[list]
    """
    A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if `image` is provided. *This value can not be imported.* *Changing `authorized_keys` forces the creation of a new Linode Instance.*
    """
    authorized_users: pulumi.Output[list]
    """
    A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user's `~/.ssh/authorized_keys` file automatically. *This value can not be imported.* *Changing `authorized_users` forces the creation of a new Linode Instance.*
    """
    backup_id: pulumi.Output[float]
    """
    A Backup ID from another Linode's available backups. Your User must have read_write access to that Linode, the Backup must have a status of successful, and the Linode must be deployed to the same region as the Backup. See /linode/instances/{linodeId}/backups for a Linode's available backups. This field and the image field are mutually exclusive. *This value can not be imported.* *Changing `backup_id` forces the creation of a new Linode Instance.*
    """
    backups: pulumi.Output[dict]
    backups_enabled: pulumi.Output[bool]
    """
    If this field is set to true, the created Linode will automatically be enrolled in the Linode Backup service. This will incur an additional charge. The cost for the Backup service is dependent on the Type of Linode deployed.
    """
    boot_config_label: pulumi.Output[str]
    """
    The Label of the Instance Config that should be used to boot the Linode instance.  If there is only one `config`, the `label` of that `config` will be used as the `boot_config_label`. *This value can not be imported.*
    """
    configs: pulumi.Output[list]
    disks: pulumi.Output[list]
    group: pulumi.Output[str]
    """
    The display group of the Linode instance.
    """
    image: pulumi.Output[str]
    """
    An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian9`, `linode/fedora28`, `linode/ubuntu16.04lts`, `linode/arch`, and `private/12345`. *Changing `image` forces the creation of a new Linode Instance.*
    """
    ip_address: pulumi.Output[str]
    ipv4s: pulumi.Output[list]
    ipv6: pulumi.Output[str]
    label: pulumi.Output[str]
    """
    The Config's label for display purposes.  Also used by `boot_config_label`.
    """
    private_ip: pulumi.Output[bool]
    """
    If true, the created Linode will have private networking enabled, allowing use of the 192.168.128.0/17 network within the Linode's region. It can be enabled on an existing Linode but it can't be disabled.
    """
    private_ip_address: pulumi.Output[str]
    region: pulumi.Output[str]
    """
    This is the location where the Linode is deployed. Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode Instance.*.
    """
    root_pass: pulumi.Output[str]
    """
    The initial password for the `root` user account. *This value can not be imported.* *Changing `root_pass` forces the creation of a new Linode Instance.* *If omitted, a random password will be generated but will not be stored in Terraform state.*
    """
    specs: pulumi.Output[dict]
    stackscript_data: pulumi.Output[dict]
    """
    An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if 'stackscript_id' is given. The required values depend on the StackScript being deployed.  *This value can not be imported.* *Changing `stackscript_data` forces the creation of a new Linode Instance.*
    """
    stackscript_id: pulumi.Output[float]
    """
    The StackScript to deploy to the newly created Linode. If provided, 'image' must also be provided, and must be an Image that is compatible with this StackScript. *This value can not be imported.* *Changing `stackscript_id` forces the creation of a new Linode Instance.*
    """
    status: pulumi.Output[str]
    swap_size: pulumi.Output[float]
    """
    When deploying from an Image, this field is optional with a Linode API default of 512mb, otherwise it is ignored. This is used to set the swap disk size for the newly-created Linode.
    """
    tags: pulumi.Output[list]
    """
    A list of tags applied to this object. Tags are for organizational purposes only.
    """
    type: pulumi.Output[str]
    """
    The Linode type defines the pricing, CPU, disk, and RAM specs of the instance.  Examples are `"g6-nanode-1"`, `"g6-standard-2"`, `"g6-highmem-16"`, `"g6-dedicated-16"`, etc.
    """
    watchdog_enabled: pulumi.Output[bool]
    """
    The watchdog, named Lassie, is a Shutdown Watchdog that monitors your Linode and will reboot it if it powers off unexpectedly. It works by issuing a boot job when your Linode powers off without a shutdown job being responsible. To prevent a loop, Lassie will give up if there have been more than 5 boot jobs issued within 15 minutes.
    """
    def __init__(__self__, resource_name, opts=None, alerts=None, authorized_keys=None, authorized_users=None, backup_id=None, backups_enabled=None, boot_config_label=None, configs=None, disks=None, group=None, image=None, label=None, private_ip=None, region=None, root_pass=None, stackscript_data=None, stackscript_id=None, swap_size=None, tags=None, type=None, watchdog_enabled=None, __name__=None, __opts__=None):
        """
        Provides a Linode Instance resource.  This can be used to create, modify, and delete Linodes.
        For more information, see [Getting Started with Linode](https://linode.com/docs/getting-started/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createLinodeInstance).
        
        The Linode Guide, [Use Terraform to Provision Linode Environments](https://www.linode.com/docs/applications/configuration-management/how-to-build-your-infrastructure-using-terraform-and-linode/), provides step-by-step guidance and additional examples.
        
        Linode Instances can also use [provisioners](https://www.terraform.io/docs/provisioners/index.html).
        
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
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[list] authorized_keys: A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if `image` is provided. *This value can not be imported.* *Changing `authorized_keys` forces the creation of a new Linode Instance.*
        :param pulumi.Input[list] authorized_users: A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user's `~/.ssh/authorized_keys` file automatically. *This value can not be imported.* *Changing `authorized_users` forces the creation of a new Linode Instance.*
        :param pulumi.Input[float] backup_id: A Backup ID from another Linode's available backups. Your User must have read_write access to that Linode, the Backup must have a status of successful, and the Linode must be deployed to the same region as the Backup. See /linode/instances/{linodeId}/backups for a Linode's available backups. This field and the image field are mutually exclusive. *This value can not be imported.* *Changing `backup_id` forces the creation of a new Linode Instance.*
        :param pulumi.Input[bool] backups_enabled: If this field is set to true, the created Linode will automatically be enrolled in the Linode Backup service. This will incur an additional charge. The cost for the Backup service is dependent on the Type of Linode deployed.
        :param pulumi.Input[str] boot_config_label: The Label of the Instance Config that should be used to boot the Linode instance.  If there is only one `config`, the `label` of that `config` will be used as the `boot_config_label`. *This value can not be imported.*
        :param pulumi.Input[str] group: The display group of the Linode instance.
        :param pulumi.Input[str] image: An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian9`, `linode/fedora28`, `linode/ubuntu16.04lts`, `linode/arch`, and `private/12345`. *Changing `image` forces the creation of a new Linode Instance.*
        :param pulumi.Input[str] label: The Config's label for display purposes.  Also used by `boot_config_label`.
        :param pulumi.Input[bool] private_ip: If true, the created Linode will have private networking enabled, allowing use of the 192.168.128.0/17 network within the Linode's region. It can be enabled on an existing Linode but it can't be disabled.
        :param pulumi.Input[str] region: This is the location where the Linode is deployed. Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode Instance.*.
        :param pulumi.Input[str] root_pass: The initial password for the `root` user account. *This value can not be imported.* *Changing `root_pass` forces the creation of a new Linode Instance.* *If omitted, a random password will be generated but will not be stored in Terraform state.*
        :param pulumi.Input[dict] stackscript_data: An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if 'stackscript_id' is given. The required values depend on the StackScript being deployed.  *This value can not be imported.* *Changing `stackscript_data` forces the creation of a new Linode Instance.*
        :param pulumi.Input[float] stackscript_id: The StackScript to deploy to the newly created Linode. If provided, 'image' must also be provided, and must be an Image that is compatible with this StackScript. *This value can not be imported.* *Changing `stackscript_id` forces the creation of a new Linode Instance.*
        :param pulumi.Input[float] swap_size: When deploying from an Image, this field is optional with a Linode API default of 512mb, otherwise it is ignored. This is used to set the swap disk size for the newly-created Linode.
        :param pulumi.Input[list] tags: A list of tags applied to this object. Tags are for organizational purposes only.
        :param pulumi.Input[str] type: The Linode type defines the pricing, CPU, disk, and RAM specs of the instance.  Examples are `"g6-nanode-1"`, `"g6-standard-2"`, `"g6-highmem-16"`, `"g6-dedicated-16"`, etc.
        :param pulumi.Input[bool] watchdog_enabled: The watchdog, named Lassie, is a Shutdown Watchdog that monitors your Linode and will reboot it if it powers off unexpectedly. It works by issuing a boot job when your Linode powers off without a shutdown job being responsible. To prevent a loop, Lassie will give up if there have been more than 5 boot jobs issued within 15 minutes.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if not resource_name:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(resource_name, str):
            raise TypeError('Expected resource name to be a string')
        if opts and not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

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

        if region is None:
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


    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

