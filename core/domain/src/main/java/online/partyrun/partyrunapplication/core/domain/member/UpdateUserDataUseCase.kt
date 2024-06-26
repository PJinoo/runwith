package online.partyrun.partyrunapplication.core.domain.member

import kotlinx.coroutines.flow.first
import online.partyrun.partyrunapplication.core.common.result.Result
import online.partyrun.partyrunapplication.core.data.repository.MemberRepository
import online.partyrun.partyrunapplication.core.model.user.User
import javax.inject.Inject

class UpdateUserDataUseCase @Inject constructor(
    private val memberRepository: MemberRepository,
) {
    suspend operator fun invoke(nickName: String): Result<Unit> {
        val currentUserData = memberRepository.userData.first()

        return memberRepository.updateUserData(
            User(
                id = currentUserData.id,
                nickName = nickName,
                profileImage = currentUserData.profileImage
            )
        )
    }

}
