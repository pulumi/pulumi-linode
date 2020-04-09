# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class GetStackScriptResult:
    """
    A collection of values returned by getStackScript.
    """
    def __init__(__self__, created=None, deployments_active=None, deployments_total=None, description=None, id=None, images=None, is_public=None, label=None, rev_note=None, script=None, updated=None, user_defined_fields=None, user_gravatar_id=None, username=None):
        if created and not isinstance(created, str):
            raise TypeError("Expected argument 'created' to be a str")
        __self__.created = created
        if deployments_active and not isinstance(deployments_active, float):
            raise TypeError("Expected argument 'deployments_active' to be a float")
        __self__.deployments_active = deployments_active
        if deployments_total and not isinstance(deployments_total, float):
            raise TypeError("Expected argument 'deployments_total' to be a float")
        __self__.deployments_total = deployments_total
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        __self__.description = description
        if id and not isinstance(id, float):
            raise TypeError("Expected argument 'id' to be a float")
        __self__.id = id
        if images and not isinstance(images, list):
            raise TypeError("Expected argument 'images' to be a list")
        __self__.images = images
        if is_public and not isinstance(is_public, bool):
            raise TypeError("Expected argument 'is_public' to be a bool")
        __self__.is_public = is_public
        if label and not isinstance(label, str):
            raise TypeError("Expected argument 'label' to be a str")
        __self__.label = label
        if rev_note and not isinstance(rev_note, str):
            raise TypeError("Expected argument 'rev_note' to be a str")
        __self__.rev_note = rev_note
        if script and not isinstance(script, str):
            raise TypeError("Expected argument 'script' to be a str")
        __self__.script = script
        if updated and not isinstance(updated, str):
            raise TypeError("Expected argument 'updated' to be a str")
        __self__.updated = updated
        if user_defined_fields and not isinstance(user_defined_fields, list):
            raise TypeError("Expected argument 'user_defined_fields' to be a list")
        __self__.user_defined_fields = user_defined_fields
        if user_gravatar_id and not isinstance(user_gravatar_id, str):
            raise TypeError("Expected argument 'user_gravatar_id' to be a str")
        __self__.user_gravatar_id = user_gravatar_id
        if username and not isinstance(username, str):
            raise TypeError("Expected argument 'username' to be a str")
        __self__.username = username
class AwaitableGetStackScriptResult(GetStackScriptResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetStackScriptResult(
            created=self.created,
            deployments_active=self.deployments_active,
            deployments_total=self.deployments_total,
            description=self.description,
            id=self.id,
            images=self.images,
            is_public=self.is_public,
            label=self.label,
            rev_note=self.rev_note,
            script=self.script,
            updated=self.updated,
            user_defined_fields=self.user_defined_fields,
            user_gravatar_id=self.user_gravatar_id,
            username=self.username)

def get_stack_script(id=None,user_defined_fields=None,opts=None):
    """
    Provides details about a specific Linode StackScript.


    ## Attributes

    This resource exports the following attributes:

    * `label` - The StackScript's label is for display purposes only.

    * `script` - The script to execute when provisioning a new Linode with this StackScript.

    * `description` - A description for the StackScript.

    * `rev_note` - This field allows you to add notes for the set of revisions made to this StackScript.

    * `is_public` - This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private.

    * `images` - An array of Image IDs representing the Images that this StackScript is compatible for deploying with.

    * `deployments_active` - Count of currently active, deployed Linodes created from this StackScript.

    * `user_gravatar_id` - The Gravatar ID for the User who created the StackScript.

    * `deployments_total` - The total number of times this StackScript has been deployed.

    * `username` - The User who created the StackScript.

    * `created` - The date this StackScript was created.

    * `updated` - The date this StackScript was updated.

    * `user_defined_fields` - This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.

      * `label` - A human-readable label for the field that will serve as the input prompt for entering the value during deployment.

      * `name` - The name of the field.

      * `example` - An example value for the field.

      * `one_of` - A list of acceptable single values for the field.

      * `many_of` - A list of acceptable values for the field in any quantity, combination or order.

      * `default` - The default value. If not specified, this value will be used.

    > This content is derived from https://github.com/terraform-providers/terraform-provider-linode/blob/master/website/docs/d/stackscript.html.md.


    :param float id: The unique numeric ID of the StackScript to query.

    The **user_defined_fields** object supports the following:

      * `default` (`str`)
      * `example` (`str`)
      * `label` (`str`)
      * `manyOf` (`str`)
      * `name` (`str`)
      * `oneOf` (`str`)
    """
    __args__ = dict()


    __args__['id'] = id
    __args__['userDefinedFields'] = user_defined_fields
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('linode:index/getStackScript:getStackScript', __args__, opts=opts).value

    return AwaitableGetStackScriptResult(
        created=__ret__.get('created'),
        deployments_active=__ret__.get('deploymentsActive'),
        deployments_total=__ret__.get('deploymentsTotal'),
        description=__ret__.get('description'),
        id=__ret__.get('id'),
        images=__ret__.get('images'),
        is_public=__ret__.get('isPublic'),
        label=__ret__.get('label'),
        rev_note=__ret__.get('revNote'),
        script=__ret__.get('script'),
        updated=__ret__.get('updated'),
        user_defined_fields=__ret__.get('userDefinedFields'),
        user_gravatar_id=__ret__.get('userGravatarId'),
        username=__ret__.get('username'))
